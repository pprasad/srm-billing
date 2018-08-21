/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.User;
import com.srm.services.standalone.utils.TableUtils;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umprasad
 */
public class UserTableModel extends AbstractTableModel{
    
    private String[] columnNames={TableUtils.TABLE_USER_EMAIL_ID,TableUtils.TABLE_USER_DISPLAY_NAME,TableUtils.TABLE_USER_MOBILE_NO};
    
    private List<User> users;

    public UserTableModel(final List<User> users) {
        this.users = users;
    }
    @Override
    public int getRowCount() {
        int size;
        if(this.users==null){
            size=0;
        }else{
            size=this.users.size();
        }
        return size;
    }
    @Override
    public int getColumnCount() {
       return this.columnNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String value=null;
        if(columnIndex==0){
             value=this.users.get(rowIndex).getEmailId();
        }else if(columnIndex==1){
            value=this.users.get(rowIndex).getDisplayName();
        }else{
            value=this.users.get(rowIndex).getMobileNo();
        }
        return value;
    }
    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }
    public User getSelectedRow(int row){
        return this.users.get(row);
    }    
    
    public void removeRow(int row){
        this.users.remove(row);
        fireTableDataChanged();
    }
    public void removeAll(){
        this.users.clear();
        fireTableDataChanged();
    }
}
