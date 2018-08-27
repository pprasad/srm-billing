/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.Customer;
import com.srm.services.modal.SalesBill;
import com.srm.services.standalone.utils.TableUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umprasad
 */
public class SalesBillInfoTableModel extends  AbstractTableModel{
    
    private String[] columnNames={TableUtils.TABLE_BILL_NO,TableUtils.TABLE_BILL_NAME,TableUtils.TABLE_BILL_DATE};
    
    private final List<SalesBill> salesBills;

    public SalesBillInfoTableModel() {
       this.salesBills=new ArrayList<>();
    }
    @Override
    public int getRowCount() {
        return this.salesBills.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value=null;
        SalesBill salesBill=this.salesBills.get(rowIndex);
        if(columnIndex==0){
            value=salesBill.getBillNo();
        }else if(columnIndex==1){
            Customer customer=salesBill.getCustomer();
            if(customer!=null){
                value=customer.getName();
            }
        }else{
            value=salesBill.getBillDate();
        }
        return value;
    }

    @Override
    public String getColumnName(int column) {
      return columnNames[column];
    }
    public SalesBill getRow(int row){
        return this.salesBills.get(row);
    }
    public void removeAll(){
        this.salesBills.clear();
        fireTableDataChanged();
    }
    public void addRows(List<SalesBill> salesBills){
        this.salesBills.addAll(salesBills);
        fireTableDataChanged();
    }
    
}
