/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.stadalone.model;

import com.srm.services.modal.Country;
import com.srm.services.standalone.utils.TableUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umprasad
 */
public class CountryTableModel extends AbstractTableModel{
    
    private String[] columnNames={TableUtils.TABLE_COUNTRY_CODE,TableUtils.TABLE_COUNTRY_NAME};
    
    private ArrayList<Country> countryList;

    public CountryTableModel(final ArrayList<Country> countryList) {
        this.countryList=countryList;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
  
    @Override
    public int getRowCount() {
       int size;
       if(countryList==null){
           size=0;
       }else{
           size=countryList.size();
       }
       return size;
    }
    @Override
    public int getColumnCount() {
       return columnNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Object value=null;
       if(columnIndex==0){
           value=countryList.get(rowIndex).getCountryCode();
       }else if(columnIndex==1){
           value=countryList.get(rowIndex).getCountryName();
       }
       return value;
    }
    @Override
    public Class getColumnClass(int columnIndex) {
        if(columnIndex==0){
            return Integer.class;
        }else{
            return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if(columnIndex==0){
            Integer countryCode=aValue!=null?Integer.valueOf(aValue.toString()):0;
            countryList.get(rowIndex).setCountryCode(countryCode);
        }else if(columnIndex==1){
            countryList.get(rowIndex).setCountryName(aValue.toString());
        }
    }
    
    
    
}
