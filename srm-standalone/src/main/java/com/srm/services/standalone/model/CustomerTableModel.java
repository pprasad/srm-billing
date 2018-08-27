package com.srm.services.standalone.model;
import com.srm.services.modal.Customer;
import com.srm.services.modal.UnitType;
import com.srm.services.standalone.utils.TableUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umprasad
 */
public class CustomerTableModel  extends  AbstractTableModel{
   
    private String [] columnNames={TableUtils.TABLE_CUSTOMER_NAME,TableUtils.TABLE_CUSTOMER_MOBILE,
                                   TableUtils.TABLE_CUSTOMER_EMAIL_ID};
    
    private final List<Customer> customers;
    
    public CustomerTableModel() {
        this.customers=new ArrayList<>();
    }
    @Override
    public int getRowCount() {
       return customers.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value=null;
        Customer customer=this.customers.get(rowIndex);
        if(columnIndex==0){
            value=customer.getName();
        }else if(columnIndex==1){
            value=customer.getMobile();
        }else if(columnIndex==2){
            value=customer.getEmailId();
        }
        return value;
    }

    @Override
    public String getColumnName(int column) {
       return this.columnNames[column];
    }
     public void addRow(final Customer customer){
        this.customers.add(customer);
        fireTableDataChanged();
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public void removeAll(){
         this.customers.clear();
         fireTableDataChanged();
    }
 
    public Customer getRow(int row){
        return this.customers.get(row);
    }
    public void removeRow(int row){
        this.customers.remove(row);
        fireTableDataChanged();
    }
    public void addRows(List<Customer> customers){
        this.customers.addAll(customers);
        fireTableDataChanged();
    }
}
