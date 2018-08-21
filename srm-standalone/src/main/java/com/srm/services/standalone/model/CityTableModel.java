/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.City;
import com.srm.services.modal.Country;
import com.srm.services.modal.State;
import com.srm.services.standalone.utils.TableUtils;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umprasad
 */
public class CityTableModel extends  AbstractTableModel{
    
    private String[] columnNames={TableUtils.TABLE_CITY_CODE,TableUtils.TABLE_CITY_NAME,TableUtils.TABLE_CITY_PIN_CODE};
    
    private List<City> citys; 

    public CityTableModel(final State state) {
       this.citys=state.getCitys();
    }
    @Override
    public int getRowCount() {
        int row=0;
        if(citys==null){
            row=0;
        }else{
            row=this.citys.size();
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
            value=this.citys.get(rowIndex).getCityId();
        }else if(columnIndex==1){
            value=this.citys.get(rowIndex).getCityName();
        }else if(columnIndex==2){
            value=this.citys.get(rowIndex).getPinCode();
        }
        return value;
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       if(columnIndex==0){
           Integer cityId=aValue!=null?Integer.valueOf(aValue.toString()):0;
           this.citys.get(rowIndex).setCityId(cityId);
       }else if(columnIndex==1){
           this.citys.get(rowIndex).setCityName(aValue.toString());
       }else if(columnIndex==2){
           this.citys.get(rowIndex).setPinCode(aValue.toString());
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
    public City findRow(int rowIndex){
        return citys.get(rowIndex);
    }
    public void removeRow(int rowIndex){
        citys.remove(findRow(rowIndex));
        this.fireTableStructureChanged();
    }
}
