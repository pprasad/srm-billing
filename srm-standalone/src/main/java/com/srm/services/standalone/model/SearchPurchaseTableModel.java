/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.Purchases;
import com.srm.services.modal.Traders;
import com.srm.services.standalone.utils.TableUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umprasad
 */
public class SearchPurchaseTableModel extends AbstractTableModel{
    
    private String[] columnNames={TableUtils.TABLE_PURCHASE_INVOICE,TableUtils.TRADER_NAME,TableUtils.TABLE_PURCHASE_BILL_DATE};
    
    private final List<Purchases> purchaseses;

    public SearchPurchaseTableModel() {
       this.purchaseses=new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return this.purchaseses.size();
    }
    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Object value=null;
       Purchases purchases=this.purchaseses.get(rowIndex);
       if(columnIndex==0){
           value=purchases.getInvoiceNo();
       }else if(columnIndex==1){
           Traders traders=purchases.getTraders();
           value=traders!=null?traders.getTraderName():null;
       }else if(columnIndex==2){
           value=purchases.getBillDate();
       }
       return value;
    }
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    public void clearAll(){
        this.purchaseses.clear();
        fireTableDataChanged();
    }
    public void addRows(List<Purchases> purchases){
        this.purchaseses.addAll(purchases);
        fireTableDataChanged();
    }    
    public Purchases getRow(int row){
       return this.purchaseses.get(row);
    }    
}
