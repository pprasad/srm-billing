/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.Country;
import com.srm.services.modal.State;
import com.srm.services.standalone.utils.TableUtils;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umprasad
 */
public class StateTableModel extends  AbstractTableModel{
    
    private String[] columnNames={TableUtils.TABLE_STATE_CODE,TableUtils.TABLE_STATE_NAME};
    
    private List<State> states; 

    public StateTableModel(final Country country) {
       this.states=country.getStates();
    }
    @Override
    public int getRowCount() {
        int row=0;
        if(states==null){
            row=0;
        }else{
            row=this.states.size();
        }
        return row;
    }
    @Override
    public int getColumnCount() {
       return this.columnNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value=null;
        if(columnIndex==0){
            value=this.states.get(rowIndex).getStateCode();
        }else{
            value=this.states.get(rowIndex).getStateName();
        }
        return value;
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       if(columnIndex==0){
           Integer stateCode=aValue!=null?Integer.valueOf(aValue.toString()):0;
           this.states.get(rowIndex).setStateCode(stateCode);
       }else{
           this.states.get(rowIndex).setStateName(aValue.toString());
       }
    }
    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    public State findRow(int rowIndex){
        return states.get(rowIndex);
    }
    public void removeRow(int rowIndex){
        states.remove(findRow(rowIndex));
        this.fireTableStructureChanged();
    }
}
