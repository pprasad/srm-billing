/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.Product;
import com.srm.services.modal.ProductType;
import com.srm.services.standalone.utils.TableUtils;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umprasad
 */
public class ProductTableModel  extends  AbstractTableModel{
   
    private String [] columnNames={TableUtils.PRODUCT_ID,TableUtils.PRODUCT_NAME,TableUtils.PRODUCT_TYPE};
    
    private List<Product> products;
    
    public ProductTableModel(List<Product> products) {
        this.products = products;
    }
    @Override
    public int getRowCount() {
       int size;
       size=this.products==null?0:this.products.size();
       return size;
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value=null;
        if(columnIndex==0){
            value=this.products.get(rowIndex).getProdCode();
        }else if(columnIndex==1){
            value=this.products.get(rowIndex).getProdName();
        }else if(columnIndex==2){
            ProductType productType=this.products.get(rowIndex).getProductType();
            if(productType!=null){
                value=productType.getProdctTypeName();
            }
        }
        return value;
    }

    @Override
    public String getColumnName(int column) {
       return this.columnNames[column];
    }
    public void addRow(final Product product){
        this.products.add(product);
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public void removeAll(){
         this.products.clear();
         fireTableDataChanged();
    }
 
    public Product getRow(int row){
        return this.products.get(row);
    }
    public void removeRow(int row){
        this.products.remove(row);
        fireTableDataChanged();
    }
}
