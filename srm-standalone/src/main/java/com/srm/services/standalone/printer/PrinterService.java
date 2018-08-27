/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.printer;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.List;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

/**
 *
 * @author umprasad
 */
public class PrinterService implements  Printable{
    
    public final String DEFAULT_PRINTER="POS-58";

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }
    
    public List<String> getPrinters(){
            DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
            PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
            PrintService printServices[] = PrintServiceLookup.lookupPrintServices(
				flavor, pras);
	    List<String> printerList = new ArrayList<String>();
	    for(PrintService printerService: printServices){
			printerList.add( printerService.getName());
	    }
	    return printerList;
    }
    public void printString(String printerName, String text) {
		
		// find the printService of name printerName
		DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
		PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
 
		PrintService printService[] = PrintServiceLookup.lookupPrintServices(
				flavor, pras);
		PrintService service = findPrintService(printerName, printService);
 
		DocPrintJob job = service.createPrintJob();
 		try {
 			byte[] bytes;
 			bytes = text.getBytes("CP437");
 			Doc doc = new SimpleDoc(bytes, flavor, null);
                        job.print(doc, null);
                        
		} catch (Exception e) {
			e.printStackTrace();
		}
 
	}
    private PrintService findPrintService(String printerName,
			PrintService[] services) {
		for (PrintService service : services) {
			if (service.getName().equalsIgnoreCase(printerName)) {
				return service;
			}
		}
 		return null;
	}
}
