/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.Product;
import com.srm.services.modal.ProductType;
import com.srm.services.modal.PurchaseStock;
import com.srm.services.standalone.utils.TableUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.EventListenerList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author umprasad
 */
public class PurchaseTableModel extends AbstractTableModel{
    
    private final static Logger LOGGER=LoggerFactory.getLogger(PurchaseTableModel.class);
    
    private String[] columnNames={TableUtils.TABLE_PURCHASE_SEQ_NO,TableUtils.TABLE_PURCHASE_ITEM_NAME,
                                  TableUtils.TABLE_PURCHASE_QTY,TableUtils.TABLE_PURCHASE_PRICE,TableUtils.TABLE_PURCHASE_AMOUNT,
                                  TableUtils.TABLE_PURCHASE_DISCOUNT,TableUtils.TABLE_PURCHASE_NET_AMT};  
    
    private List<PurchaseStock> purchaseStocks;
    
    private Boolean isObject;

    public PurchaseTableModel() {
       this.purchaseStocks=new ArrayList<>();
       isObject=Boolean.TRUE;
    }
    public void setIsObject(Boolean isObject){
        this.isObject=isObject;
    }
    @Override
    public int getRowCount() {
        if(this.purchaseStocks==null){
            return 0;
        }else{
            return this.purchaseStocks.size();
        }
    }

    @Override
    public int getColumnCount() {
       return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Object value=null;
       PurchaseStock purchaseStock=this.purchaseStocks.get(rowIndex);
       if(columnIndex==0){
           value=rowIndex+1;
       }else if(columnIndex==1){
           if(isObject){
              value=purchaseStock.getProduct();
           }else{
               Product product=purchaseStock.getProduct();
               if(product!=null){
                   value=product.getProdName();
               }
           }
       }else if(columnIndex==2){
           value=purchaseStock.getPrice();
       }else if(columnIndex==3){
           value=purchaseStock.getQty();
       }else if(columnIndex==4){
           value=purchaseStock.getAmount();
       }else if(columnIndex==5){
           value=purchaseStock.getDiscount();
       }else if(columnIndex==6){
           value=purchaseStock.getTotalAmt();
       }
       return value;
    }
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       PurchaseStock purchaseStock=this.purchaseStocks.get(rowIndex); 
       if(columnIndex==0){
           purchaseStock.setSeqNo((Integer)aValue);
       }
       if(columnIndex==1){
           purchaseStock.setProduct((Product)aValue);
       }else if(columnIndex==2){
          Double value=aValue!=null?Double.valueOf(aValue.toString()):0; 
          purchaseStock.setPrice(value);
       }else if(columnIndex==3){
          Integer value=aValue!=null?Integer.valueOf(aValue.toString()):0;
          purchaseStock.setQty(value);
       }else if(columnIndex==4){
          Double value=aValue!=null?Double.valueOf(aValue.toString()):0;  
          purchaseStock.setAmount(value);
       }else if(columnIndex==5){
           Integer value=aValue!=null?Integer.valueOf(aValue.toString()):0;
          purchaseStock.setDiscount(value);
       }else if(columnIndex==6){
           Double value=aValue!=null?Double.valueOf(aValue.toString()):0; 
          purchaseStock.setTotalAmt(value);
       }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    public void addRow(PurchaseStock purchaseStock){
         int len=getRowCount();
         purchaseStock.setSeqNo(len+1);
         this.purchaseStocks.add(purchaseStock);
         fireTableDataChanged();
         
    }
    public void addRow(PurchaseStock purchaseStock,Integer referNo){
         int len=getRowCount();
         purchaseStock.setRefereNo(referNo);
         purchaseStock.setDelete(Boolean.FALSE);
         this.purchaseStocks.add(purchaseStock);
         fireTableDataChanged();
         
    }
    public void addRows(List<PurchaseStock> purchaseStocks){
        this.purchaseStocks.addAll(purchaseStocks);
        fireTableDataChanged();
    }
    public PurchaseStock getRow(int row){
        return this.purchaseStocks.get(row);
    }
    public void removeRow(PurchaseStock purchaseStock){
        this.purchaseStocks.remove(purchaseStock);
        fireTableDataChanged();
    }
     public void removeRow(int row){
        this.purchaseStocks.remove(row);
        fireTableDataChanged();
    }
    public void removeRows(){
        this.purchaseStocks.clear();
        fireTableDataChanged();
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex > 0;
    }

    @Override
    public void fireTableCellUpdated(int row, int column) {
       PurchaseStock purchaseStock=this.purchaseStocks.get(row);
       if(column==2 || column==3){
            Integer qty=purchaseStock.getQty()!=null?purchaseStock.getQty():0;
            Double amount=purchaseStock.getPrice()*qty;
            purchaseStock.setAmount(amount);
            fireTableDataChanged();
       }else if(column==5){
            Double amount=purchaseStock.getAmount()-(purchaseStock.getDiscount()*purchaseStock.getAmount())/100;
            purchaseStock.setTotalAmt(amount);
            fireTableDataChanged();
       }
    }
    public List<PurchaseStock> getAllRows(){
        return this.purchaseStocks;
    }
 }
