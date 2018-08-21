/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.Traders;
import com.srm.services.standalone.utils.TableUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umprasad
 */
public class TraderTableModel extends AbstractTableModel{
    
    private String[] columNames={TableUtils.TRADER_NAME,TableUtils.TRADER_TIN_NO,TableUtils.TRADER_MOBILE_NO};
    
    private List<Traders> traderses;

    public TraderTableModel(List<Traders> traderses) {
        if(this.traderses==null){
            this.traderses=new ArrayList<>();
        }
    }
    @Override
    public int getRowCount() {
         int size;
         if(this.traderses==null)size=0;
         else size=this.traderses.size();
         return size;
    }
    @Override
    public int getColumnCount() {
        return this.columNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value=null;
        if(columnIndex==0){value=this.traderses.get(rowIndex).getTraderName();}
        else if(columnIndex==1){value=this.traderses.get(rowIndex).getTinNo();}
        else if(columnIndex==2){value=this.traderses.get(rowIndex).getMobileNo();}
        return value;
    }

    @Override
    public String getColumnName(int column) {
        return this.columNames[column];
    }
    public Traders getRow(int row){
        return this.traderses.get(row);
    }
    public void addRow(Traders traders){
        this.traderses.add(traders);
        fireTableDataChanged();
    }
    public void clearRows(){
        this.traderses.clear();
        fireTableDataChanged();
    }
    public void addRows(List<Traders> traderses){
        this.traderses.addAll(traderses);
        fireTableDataChanged();
    }
    public void deleteRow(int row){
        this.traderses.remove(row);
        fireTableDataChanged();
    }
    public void removeRow(Traders traders){
        this.traderses.remove(traders);
        fireTableDataChanged();
    }
    public void refresh(){
        fireTableDataChanged();
    }
}
