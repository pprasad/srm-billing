/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.controller;

import com.srm.services.config.ServiceConstant;
import com.srm.services.modal.SalesBill;
import com.srm.services.services.SalesBillService;
import com.srm.services.standalone.listeners.SalesBillInfoListener;
import com.srm.services.standalone.model.SalesBillInfoTableModel;
import com.srm.services.standalone.utils.StandaloneUtils;
import com.srm.services.standalone.utils.TableFilter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author umprasad
 */
public class SalesBillInfoForm extends javax.swing.JDialog {

    /**
     * Creates new form SalesBillInfoForm
     */
    public SalesBillInfoForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jXImagePanel1 = new com.srm.components.JXImagePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesBillInfoTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchFilterTxt = new javax.swing.JTextField();
        viewActionBtn = new javax.swing.JButton();
        closeActionBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jXImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/app-background.png"))); // NOI18N

        salesBillInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(salesBillInfoTable);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N

        viewActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/show.png"))); // NOI18N
        viewActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionBtnActionPerformed(evt);
            }
        });

        closeActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close-window-24.png"))); // NOI18N
        closeActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXImagePanel1Layout = new javax.swing.GroupLayout(jXImagePanel1);
        jXImagePanel1.setLayout(jXImagePanel1Layout);
        jXImagePanel1Layout.setHorizontalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchFilterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(jXImagePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXImagePanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jXImagePanel1Layout.setVerticalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXImagePanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchFilterTxt)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewActionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeActionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionBtnActionPerformed
         this.show(false);
    }//GEN-LAST:event_closeActionBtnActionPerformed

    private void viewActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionBtnActionPerformed
        try{
             int row=salesBillInfoTable.getSelectedRow();
             if(salesBillInfoTable.getRowSorter()!=null){
                 row=salesBillInfoTable.getRowSorter().convertRowIndexToModel(row);
                 SalesBill salesBill=salesBillInfoTableModel.getRow(row);
                 salesBillInfoListener.viewData(salesBill);
             }else if(row!=-1){
                  SalesBill salesBill=salesBillInfoTableModel.getRow(row);
                  salesBillInfoListener.viewData(salesBill);
             }
        }catch(Exception ex){
            StandaloneUtils.dialogBox(ServiceConstant.ERROR_MSG_RECORD, rootPane);
        }
    }//GEN-LAST:event_viewActionBtnActionPerformed

    private void setModel(){
        salesBillInfoTableModel=new SalesBillInfoTableModel();
        salesBillInfoTable.setModel(salesBillInfoTableModel);
        TableFilter<SalesBillInfoTableModel> filter=new TableFilter(salesBillInfoTable, searchFilterTxt);
        filter.applyFilter();
       
    }
    public void loadData(){
        salesBillInfoTableModel.removeAll();
        List<SalesBill> salesBills=salesBillService.findAllBills();
        if(salesBills!=null){
            salesBillInfoTableModel.addRows(salesBills);
        }
    }

    public SalesBillInfoListener getSalesBillInfoListener() {
        return salesBillInfoListener;
    }

    public void setSalesBillInfoListener(SalesBillInfoListener salesBillInfoListener) {
        this.salesBillInfoListener = salesBillInfoListener;
    }
    
    @Autowired private SalesBillService salesBillService;
    private SalesBillInfoTableModel salesBillInfoTableModel;
    private SalesBillInfoListener salesBillInfoListener;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeActionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.srm.components.JXImagePanel jXImagePanel1;
    private javax.swing.JTable salesBillInfoTable;
    private javax.swing.JTextField searchFilterTxt;
    private javax.swing.JButton viewActionBtn;
    // End of variables declaration//GEN-END:variables
}
