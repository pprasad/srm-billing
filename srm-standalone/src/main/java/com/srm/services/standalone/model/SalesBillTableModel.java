/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.Product;
import com.srm.services.modal.SalesBillStock;
import com.srm.services.modal.UnitType;
import com.srm.services.standalone.utils.TableUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author umprasad
 */
public class SalesBillTableModel extends AbstractTableModel{
    
    private final static Logger LOGGER=LoggerFactory.getLogger(SalesBillTableModel.class);
    
    private String [] columnNames={TableUtils.TABLE_BILL_ITEM_NAME,TableUtils.TABLE_BILL_PRICE,
                                   TableUtils.TABLE_BILL_QTY,TableUtils.TABLE_BILL_UNIT,
                                   TableUtils.TABLE_BILL_AMOUNT,TableUtils.TABLE_BILL_DISCOUNT,
                                    TableUtils.TABLE_BILL_NET_AMT};
    private List<SalesBillStock> salesBillStocks;
    
    private List<SalesBillStock> removeStocks;
    
    private Boolean isEidtable=false;

    public SalesBillTableModel() {
        this.salesBillStocks =new ArrayList<>();
        this.removeStocks=new ArrayList<>();
    }
      

    @Override
    public int getRowCount() {
        return this.salesBillStocks.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value=null;
        SalesBillStock salesBillStock=this.salesBillStocks.get(rowIndex);
        if(columnIndex==0){
            Product product=salesBillStock.getProduct();
            value=product.getProdName();
        }else if(columnIndex==1){
            value=salesBillStock.getPrice();
        }else if(columnIndex==2){
            value=salesBillStock.getQty();
        }else if(columnIndex==3){
            UnitType unitType=salesBillStock.getUnitType();
            LOGGER.info("UnitType{}",unitType);
            if(unitType!=null){
               value=unitType.getUnitId();
            }
        }else if(columnIndex==4){
            value=salesBillStock.getAmount();
        }else if(columnIndex==5){
            value=salesBillStock.getDiscount();
        }else if(columnIndex==6){
            value=salesBillStock.getNetAmount();
        }
        return value;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return isEidtable;
    }
    
    public void setIsEditable(Boolean isEditable){
        this.isEidtable=isEditable;
    }
    
    public SalesBillStock getRow(int row){
        return this.salesBillStocks.get(row);
    }
    
    public void addRow(SalesBillStock salesBillStock){
        this.salesBillStocks.add(salesBillStock);
        fireTableRowsInserted(getRowCount(),getRowCount());
    }
    public void removeRow(int row){
        this.removeStocks.add(getRow(row));
        this.salesBillStocks.remove(row);
        fireTableRowsDeleted(getColumnCount(),getColumnCount());
    }
     public void removeAll(){
        this.salesBillStocks.clear();
        this.removeStocks.clear();
        fireTableDataChanged();
    }
    public void addRows(List<SalesBillStock> salesBillStocks){
        this.salesBillStocks.addAll(salesBillStocks);
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    public List<SalesBillStock> getRows(){
        return this.salesBillStocks;
    }
    
    public List<SalesBillStock> getDeletedRows(){
         return this.removeStocks;
    }
    
    
}
