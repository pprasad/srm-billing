/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.controller;

import com.srm.services.modal.Purchases;
import com.srm.services.services.TradersService;
import com.srm.services.standalone.listeners.DataUpdateListener;
import com.srm.services.standalone.model.SearchPurchaseTableModel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author umprasad
 */
@Component
public class PurchaseSearchPanel extends javax.swing.JPanel {

    /**
     * Creates new form PanelSearch
     */
    public PurchaseSearchPanel() {
        initComponents();
        setModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filterTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchPurchaseTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));

        searchPurchaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        searchPurchaseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchPurchaseTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchPurchaseTable);

        jLabel1.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filterTxt)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchPurchaseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchPurchaseTableMouseClicked
       try{
           int row=searchPurchaseTable.getSelectedRow();
           if(row!=-1){
               Purchases purchases=purchaseTableModel.getRow(row);
               listener.dataSelected(purchases);
           }
       }catch(Exception ex){
           LOGGER.error("Exception{}",ex);
       }
    }//GEN-LAST:event_searchPurchaseTableMouseClicked
    private void setModel(){
        purchaseTableModel=new SearchPurchaseTableModel();
        searchPurchaseTable.setModel(purchaseTableModel);
        JTable jTable=new JTable();
        RowSorter<? extends TableModel> rs=searchPurchaseTable.getRowSorter();
        if(rs == null) {
            searchPurchaseTable.setAutoCreateRowSorter(true);
            rs =searchPurchaseTable.getRowSorter();
         }
        TableRowSorter<? extends TableModel> rowSorter =
                (rs instanceof TableRowSorter) ? (TableRowSorter<? extends TableModel>)rs :null;
        filterTxt.getDocument().addDocumentListener(new DocumentListener() {
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
            private void update(DocumentEvent e) {
                String text = filterTxt.getText();
                if(text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                }else{
                  rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
        });
    }
    public void loadData(){
        purchaseTableModel.clearAll();
        purchaseTableModel.addRows(tradersService.findAllPurchases());
    }
    public void setDataUpdateListener(DataUpdateListener listener){
        this.listener=listener;
    }
    private SearchPurchaseTableModel purchaseTableModel;
    @Autowired private TradersService tradersService;
    private DataUpdateListener listener;
    private final static Logger LOGGER=LoggerFactory.getLogger(PurchaseSearchPanel.class);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filterTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable searchPurchaseTable;
    // End of variables declaration//GEN-END:variables
}
