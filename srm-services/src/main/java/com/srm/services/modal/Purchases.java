/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.modal;

import java.io.Serializable;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author umprasad
 */
@Document(collection="Purchases")
public class Purchases implements Serializable{
    @Id
    private Integer refereNo;
    
    @DBRef
    private Traders traders;
    
    private String invoiceNo;
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date billDate;
    
    private Double totalAmt;
    
    private Integer vat;
    
    private Integer gstTax;
    
    private Double netAmt;

    public Integer getRefereNo() {
        return refereNo;
    }

    public void setRefereNo(Integer refereNo) {
        this.refereNo = refereNo;
    }

    public Traders getTraders() {
        return traders;
    }

    public void setTraders(Traders traders) {
        this.traders = traders;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(Double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    public Integer getGstTax() {
        return gstTax;
    }

    public void setGstTax(Integer gstTax) {
        this.gstTax = gstTax;
    }

    public Double getNetAmt() {
        return netAmt;
    }

    public void setNetAmt(Double netAmt) {
        this.netAmt = netAmt;
    }
    
    
}
