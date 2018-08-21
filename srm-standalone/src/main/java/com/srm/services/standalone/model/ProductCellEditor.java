/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.model;

import com.srm.services.modal.Product;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.table.TableCellEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author umprasad
 */
public class ProductCellEditor extends AbstractCellEditor implements TableCellEditor,ActionListener{
    
    private final static Logger LOGGER=LoggerFactory.getLogger(ProductCellEditor.class);

    private List<Product> products;
    
    private Product product;
    
    public ProductCellEditor(final List<Product> products) {
        this.products=products;
    }

    @Override
    public Object getCellEditorValue() {
        return this.product;     
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        if(value instanceof Product){
            this.product=(Product)value;
        }
        JComboBox<Product> prodComboBox=new JComboBox<>();
        prodComboBox.setRenderer(new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if(value instanceof Product){
                    Product aProduct=(Product)value;
                    setText(aProduct.getProdName());
                }
                return this;
            }
            
        });
        LOGGER.info("Products IsEmpty{}",this.products.isEmpty());
        for(Product aProduct:products){
            prodComboBox.addItem(aProduct);
        }
        prodComboBox.repaint();
        prodComboBox.setSelectedItem(product);
        prodComboBox.addActionListener(this);
        return prodComboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       JComboBox<Product> prodComboBox= (JComboBox<Product>)e.getSource();
       this.product=(Product)prodComboBox.getSelectedItem();
    }

       
}
