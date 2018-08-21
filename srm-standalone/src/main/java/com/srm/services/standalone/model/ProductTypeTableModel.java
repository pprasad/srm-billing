/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.ProductType;
import com.srm.services.standalone.utils.TableUtils;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umprasad
 */
public class ProductTypeTableModel  extends  AbstractTableModel{
   
    private String [] columnNames={TableUtils.PRODUCT_TYPE_ID,TableUtils.PRODUCT_TYPE_NAME};
    
    private List<ProductType> productTypes;
    
    private final List<ProductType> tempType;

    public ProductTypeTableModel(List<ProductType> productTypes) {
        this.productTypes = productTypes;
        this.tempType=new ArrayList<ProductType>();
    }
    @Override
    public int getRowCount() {
       int size;
       size=this.productTypes==null?0:this.productTypes.size();
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
            value=this.productTypes.get(rowIndex).getProductTypeId();
        }else{
            value=this.productTypes.get(rowIndex).getProdctTypeName();
        }
        return value;
    }

    @Override
    public String getColumnName(int column) {
       return this.columnNames[column];
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       if(columnIndex==0){
           Integer id=aValue!=null?Integer.valueOf(aValue.toString()):0;
           this.productTypes.get(rowIndex).setProductTypeId(id);
       }else{
           this.productTypes.get(rowIndex).setProdctTypeName(aValue.toString());
       }
    }
    
    public void addRow(final ProductType productType){
        this.tempType.add(productType);
        this.productTypes.add(productType);
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    public List<ProductType> getNewRows(){
        return this.tempType;
    }
    
    public void removeAll(){
         this.productTypes.clear();
         this.tempType.clear();
         fireTableDataChanged();
    }
 
    public ProductType getRow(int row){
        return this.productTypes.get(row);
    }
    public void removeRow(int row){
        this.productTypes.remove(row);
        fireTableDataChanged();
    }
}
