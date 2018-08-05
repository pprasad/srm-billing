/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.controller;

import com.srm.services.modal.Country;
import com.srm.services.modal.State;
import com.srm.services.stadalone.model.CountryCellRender;
import com.srm.services.stadalone.model.CountryTableModel;
import com.srm.services.stadalone.model.StateTableModel;
import com.srm.services.standalone.utils.StandaloneUtils;
import com.srm.services.standalone.utils.TableUtils;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author umprasad
 */
public class CountryForm extends javax.swing.JDialog {

    /**
     * Creates new form CountryForm
     */
    public CountryForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        countryTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        countryJtree = new javax.swing.JTree();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jXImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/app-background.png"))); // NOI18N

        jScrollPane2.setViewportView(countryTable);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");

        jButton3.setText("Delete");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Country");
        countryJtree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        countryJtree.setCellRenderer(new CountryCellRender());
        countryJtree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countryJtreeMouseClicked(evt);
            }
        });
        countryJtree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                countryJtreeValueChanged(evt);
            }
        });
        countryJtree.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                countryJtreePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(countryJtree);

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXImagePanel1Layout = new javax.swing.GroupLayout(jXImagePanel1);
        jXImagePanel1.setLayout(jXImagePanel1Layout);
        jXImagePanel1Layout.setHorizontalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXImagePanel1Layout.createSequentialGroup()
                        .addGap(0, 252, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jXImagePanel1Layout.setVerticalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXImagePanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXImagePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(isCountryNode){
            for(Country country:countrys){
               updateCountryNode(country);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void updateCountryNode(Country country){
        DefaultTreeModel model = (DefaultTreeModel)countryJtree.getModel();
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)countryJtree.getModel().getRoot();
        DefaultMutableTreeNode childNode=new DefaultMutableTreeNode(country);
        int index=childIndex(root,country.getCountryName());
        if(index==-1){
           model.insertNodeInto(childNode, root,root.getChildCount());
         }
        countryJtree.repaint();
    }
    private void countryJtreePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_countryJtreePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_countryJtreePropertyChange
     private int childIndex(final DefaultMutableTreeNode node, final String childValue) {
        Enumeration<DefaultMutableTreeNode> children = node.children();
        DefaultMutableTreeNode child = null;
        int index = -1;
        while (children.hasMoreElements() && index < 0) {
            child = children.nextElement();
            Country country=(Country)child.getUserObject();
            LOGGER.info("Country{}"+country.getCountryName());
            if (country!=null && childValue.equals(country.getCountryName())) {
                index = node.getIndex(child);
            }
        }
        return index;
    }
    private void countryJtreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_countryJtreeValueChanged
        // TODO add your handling code here:
        TreePath countryPath=evt.getPath().getParentPath();
        if(countryPath==null || (countryPath!=null && StandaloneUtils.COUNTRY_NODE.equals(countryPath.toString()))){
            isCountryNode=true;
            addCountryModel();
        }else{
           DefaultMutableTreeNode selectTreeNode=(DefaultMutableTreeNode)evt.getPath().getLastPathComponent();
           if(selectTreeNode.getUserObject() instanceof Country){
                Country country=(Country)selectTreeNode.getUserObject();
                LOGGER.info("Object info"+country.getCountryName());
                isStateNode=true;
                isCountryNode=false;
                this.selectedCountry=country;
                addStateModel(this.selectedCountry);
           }
        }
    }//GEN-LAST:event_countryJtreeValueChanged
    private void countryJtreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryJtreeMouseClicked
       
    }//GEN-LAST:event_countryJtreeMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LOGGER.info("isStateSelected"+isStateNode);
        if(isCountryNode){
           countrys.add(new Country());
           countryTableModel.fireTableDataChanged();
           countryTable.repaint();
       }else if(isStateNode){
           if(this.selectedCountry.getStates()==null){
               this.selectedCountry.setStates(new ArrayList<>());
           }
           LOGGER.info("*************Instered State Row****************");
           this.selectedCountry.getStates().add(new State());
           stateTableModel.fireTableDataChanged();
           countryTable.repaint();
       }
    }//GEN-LAST:event_jButton4ActionPerformed
    private void addCountryModel(){
        countryTable.removeAll();
        if(countrys==null){countrys=new ArrayList<Country>();}
        countryTableModel=new CountryTableModel(countrys);
        countryTable.setModel(countryTableModel);
        countryTable.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int firstRow = e.getFirstRow();
                int lastRow = e.getLastRow();
                int index = e.getColumn();
                switch(e.getType()){
                    case TableModelEvent.INSERT:
                        LOGGER.info("***Inserted****");
                        break;
                }
            }
        });
    }
    private void addStateModel(final Country country){
        countryTable.removeAll();
        stateTableModel=new StateTableModel(country);
        countryTable.setModel(stateTableModel);
    }
    private static final Logger LOGGER=LoggerFactory.getLogger(CountryForm.class);
    private CountryTableModel countryTableModel;
    private StateTableModel stateTableModel;
    private boolean isCountryNode=false;
    private ArrayList<Country> countrys;
    private boolean isStateNode=false;
    private Country selectedCountry=null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree countryJtree;
    private javax.swing.JTable countryTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.srm.components.JXImagePanel jXImagePanel1;
    // End of variables declaration//GEN-END:variables
}
