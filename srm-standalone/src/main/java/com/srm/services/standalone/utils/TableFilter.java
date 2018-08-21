/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.utils;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author umprasad
 */
public class TableFilter {
    private JTable jTable;
    private RowSorter<? extends TableModel> rowSorter;
    private TableRowSorter<? extends TableModel> tableRowSorter;
    private JTextField jTextField;

    public TableFilter(JTable jTable,JTextField jTextField) {
        this.jTable = jTable;
        this.jTextField=jTextField;
    }
    public void applyFilter(){
        rowSorter=jTable.getRowSorter();
        if(rowSorter==null){
            jTable.setAutoCreateRowSorter(true);
            rowSorter=jTable.getRowSorter();
        }
        tableRowSorter=(TableRowSorter<TableModel>)rowSorter;
        jTextField.getDocument().addDocumentListener(documentListener);
    }
    
    private DocumentListener documentListener=new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            update(e);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
           update(e);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
           update(e);
        }
        private void update(DocumentEvent e){
             String text = jTextField.getText();
             if(text.trim().length() == 0) {
                  tableRowSorter.setRowFilter(null);
             }else{
                  tableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" +text));
             }
        }
    };
    
}
