/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.controller;

import com.srm.services.config.ServiceConstant;
import com.srm.services.modal.Product;
import com.srm.services.modal.ProductType;
import com.srm.services.services.ProductService;
import com.srm.services.standalone.model.ProductTableModel;
import com.srm.services.standalone.model.ProductTypeTableModel;
import com.srm.services.standalone.utils.StandaloneUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author umprasad
 */
public class CategoryForm extends javax.swing.JDialog {
    private final static Logger LOGGER=LoggerFactory.getLogger(CategoryForm.class);
    /**
     * Creates new form CategoryForm
     */
    public CategoryForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jXImagePanel1 = new com.srm.components.JXImagePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTypeTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        filterSearchTxt = new javax.swing.JTextField();
        addActionBtn = new javax.swing.JButton();
        saveActionBtn = new javax.swing.JButton();
        removeActionBtn = new javax.swing.JButton();
        refreshActionBtn = new javax.swing.JButton();
        jXImagePanel2 = new com.srm.components.JXImagePanel();
        jLabel2 = new javax.swing.JLabel();
        productCodeTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productTypeActionBox = new javax.swing.JComboBox<>();
        saveProdActionBtn = new javax.swing.JButton();
        removePrdActionBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        prodUpdateActionBtn = new javax.swing.JButton();
        newProdActionBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setLocationByPlatform(true);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jXImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/app-background.png"))); // NOI18N

        productTypeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        productTypeTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(productTypeTable);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jLabel1.setText("Search");

        addActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus_1.png"))); // NOI18N
        addActionBtn.setText("Add");
        addActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionBtnActionPerformed(evt);
            }
        });

        saveActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        saveActionBtn.setText("Save");
        saveActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionBtnActionPerformed(evt);
            }
        });

        removeActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x-button_1.png"))); // NOI18N
        removeActionBtn.setText("Remove");
        removeActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionBtnActionPerformed(evt);
            }
        });

        refreshActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        refreshActionBtn.setText("Refresh");
        refreshActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXImagePanel1Layout = new javax.swing.GroupLayout(jXImagePanel1);
        jXImagePanel1.setLayout(jXImagePanel1Layout);
        jXImagePanel1Layout.setHorizontalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXImagePanel1Layout.createSequentialGroup()
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jXImagePanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jXImagePanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                            .addGroup(jXImagePanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterSearchTxt)))))
                .addGap(33, 33, 33))
        );
        jXImagePanel1Layout.setVerticalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(filterSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("products", jXImagePanel1);

        jXImagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/app-background.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jLabel2.setText("Product Code");

        jLabel3.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jLabel3.setText("Product Name");

        jLabel4.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jLabel4.setText("Product Type");

        productTypeActionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        productTypeActionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productTypeActionBoxActionPerformed(evt);
            }
        });

        saveProdActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        saveProdActionBtn.setText("Save");
        saveProdActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProdActionBtnActionPerformed(evt);
            }
        });

        removePrdActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x-button_1.png"))); // NOI18N
        removePrdActionBtn.setText("Remove");
        removePrdActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePrdActionBtnActionPerformed(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        productTable.setColumnSelectionAllowed(true);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(productTable);

        prodUpdateActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        prodUpdateActionBtn.setText("Update");
        prodUpdateActionBtn.setEnabled(false);
        prodUpdateActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodUpdateActionBtnActionPerformed(evt);
            }
        });

        newProdActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file.png"))); // NOI18N
        newProdActionBtn.setText("New");
        newProdActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProdActionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXImagePanel2Layout = new javax.swing.GroupLayout(jXImagePanel2);
        jXImagePanel2.setLayout(jXImagePanel2Layout);
        jXImagePanel2Layout.setHorizontalGroup(
            jXImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXImagePanel2Layout.createSequentialGroup()
                        .addGroup(jXImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jXImagePanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jXImagePanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jXImagePanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productTypeActionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 228, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXImagePanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(newProdActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveProdActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prodUpdateActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removePrdActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jXImagePanel2Layout.setVerticalGroup(
            jXImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jXImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jXImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(productNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jXImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productTypeActionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jXImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveProdActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removePrdActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodUpdateActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newProdActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SUB Products", jXImagePanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productTypeActionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productTypeActionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productTypeActionBoxActionPerformed

    private void addActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionBtnActionPerformed
        productTypeTableModel.addRow(new ProductType());
        
    }//GEN-LAST:event_addActionBtnActionPerformed

    private void saveActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionBtnActionPerformed
       try{ 
            List<ProductType> tempTypes=productTypeTableModel.getNewRows();
            LOGGER.info("Size{}"+tempTypes.isEmpty());
            if(productService.save(tempTypes)!=null){
                tempTypes.clear();
                StandaloneUtils.dialogBox(ServiceConstant.ACTION_SAVE,this);
            }
       }catch(Exception ex){
            StandaloneUtils.dialogBox(ServiceConstant.TECHNICAL_ERROR_MSG,this);
       }
    }//GEN-LAST:event_saveActionBtnActionPerformed

    private void removeActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionBtnActionPerformed
       int row=productTypeTable.getSelectedRow();
       if(row!=-1){
            ProductType productType=productTypeTableModel.getRow(row);
            productService.deleteProductType(productType);
            productTypeTableModel.removeRow(row);
            StandaloneUtils.dialogBox(ServiceConstant.ACTION_UPDATE,this);
       }
    }//GEN-LAST:event_removeActionBtnActionPerformed

    private void refreshActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionBtnActionPerformed
        this.loadInitalData();
    }//GEN-LAST:event_refreshActionBtnActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
       int index=jTabbedPane1.getSelectedIndex();
       if(index==1){
           productTypeActionBox.removeAllItems();
           List<String> prodTypes=productService.findAllProductTypes();
           if(prodTypes!=null){
               DefaultComboBoxModel<String> model=new DefaultComboBoxModel<>();
               model.addElement(ServiceConstant.DEFAULT_VALUE);
               prodTypes.stream().forEach(prodType->model.addElement(prodType));
               productTypeActionBox.setModel(model);
           }
       }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void saveProdActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProdActionBtnActionPerformed
       try{
            Product product=new Product();
            product.setProdCode(productCodeTxt.getText());
            product.setProdName(productNameTxt.getText());
            String value=productTypeActionBox.getSelectedItem().toString();
            ProductType productType=productService.findProductTypeByName(value);
            product.setProductType(productType);
            productService.save(product);
            productTableModel.addRow(product);
            StandaloneUtils.dialogBox(ServiceConstant.ACTION_SAVE,this);
       }catch(Exception ex){
             StandaloneUtils.dialogBox("Please chocise Different Product Code",this);
       }
    }//GEN-LAST:event_saveProdActionBtnActionPerformed

    private void prodUpdateActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodUpdateActionBtnActionPerformed
      try{
            selectedProduct.setProdName(productNameTxt.getText());
            String value=productTypeActionBox.getSelectedItem().toString();
            ProductType productType=productService.findProductTypeByName(value);
            selectedProduct.setProductType(productType);
            productService.update(selectedProduct);
            StandaloneUtils.dialogBox(ServiceConstant.ACTION_UPDATE,this);
            this.selectedProduct=null;
            productTableModel.fireTableDataChanged();
       }catch(Exception ex){
             StandaloneUtils.dialogBox(ServiceConstant.TECHNICAL_ERROR_MSG,this);
       }
    }//GEN-LAST:event_prodUpdateActionBtnActionPerformed

    private void newProdActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProdActionBtnActionPerformed
         productCodeTxt.setText("");
         productNameTxt.setText("");
         productTypeActionBox.setSelectedIndex(0);
         saveProdActionBtn.setEnabled(Boolean.TRUE);
         prodUpdateActionBtn.setEnabled(Boolean.FALSE);
         productCodeTxt.setEditable(Boolean.TRUE);
         this.selectedProduct=null;
    }//GEN-LAST:event_newProdActionBtnActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        int row=productTable.getSelectedRow();
        if(row!=-1){
            this.selectedProduct=productTableModel.getRow(row);
            productCodeTxt.setText(selectedProduct.getProdCode());
            productNameTxt.setText(selectedProduct.getProdName());
            ProductType productType=selectedProduct.getProductType();
            productTypeActionBox.setSelectedItem(productType.getProdctTypeName());
            saveProdActionBtn.setEnabled(Boolean.FALSE);
            prodUpdateActionBtn.setEnabled(Boolean.TRUE);
            productCodeTxt.setEditable(Boolean.FALSE);
        }
    }//GEN-LAST:event_productTableMouseClicked

    private void removePrdActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePrdActionBtnActionPerformed
        try{
            int row=productTable.getSelectedRow();
            productService.deleteProduct(selectedProduct);
            productTableModel.removeRow(row);
            StandaloneUtils.dialogBox(ServiceConstant.ACTION_DELETE,this);
            newProdActionBtnActionPerformed(evt);
        }catch(Exception ex){
            StandaloneUtils.dialogBox(ServiceConstant.TECHNICAL_ERROR_MSG,this);
        }
    }//GEN-LAST:event_removePrdActionBtnActionPerformed
    private void setModel(){
        if(this.productTypes==null){this.productTypes=new ArrayList<>();}
        productTypeTableModel=new ProductTypeTableModel(productTypes);
        productTypeTable.setModel(productTypeTableModel);
        if(this.products==null){this.products=new ArrayList<>();}
        productTableModel=new ProductTableModel(products);
        productTable.setModel(productTableModel);
        RowSorter<? extends TableModel> productTypeSorter=productTypeTable.getRowSorter();
        if(productTypeSorter==null){
             productTypeTable.setAutoCreateRowSorter(true);
             productTypeSorter=productTypeTable.getRowSorter();
        }
        TableRowSorter<?extends TableModel> prodTypeSorter=
                (productTypeSorter instanceof TableRowSorter)?(TableRowSorter<? extends TableModel>)productTypeSorter:null;
       
        filterSearchTxt.getDocument().addDocumentListener(new DocumentListener() {
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
                String text=filterSearchTxt.getText();
                if(text.trim().length()==0){
                    prodTypeSorter.setRowFilter(null);
                }else{
                    prodTypeSorter.setRowFilter(RowFilter.regexFilter("(?i)"+text));
                }
            }
        });
    }
    @PostConstruct
    private void loadInitalData(){
        productTypeTableModel.removeAll();
        productTypes.addAll(productService.findAllProdcutTypes());
        productTypeTableModel.fireTableDataChanged();
        productTableModel.removeAll();
        products.addAll(productService.findAllProducts());
    }
    private ProductTableModel productTableModel;
    private ProductTypeTableModel productTypeTableModel;
    private List<ProductType> productTypes;
    private List<Product> products;
    private Product selectedProduct;
    @Autowired private ProductService productService;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addActionBtn;
    private javax.swing.JTextField filterSearchTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.srm.components.JXImagePanel jXImagePanel1;
    private com.srm.components.JXImagePanel jXImagePanel2;
    private javax.swing.JButton newProdActionBtn;
    private javax.swing.JButton prodUpdateActionBtn;
    private javax.swing.JTextField productCodeTxt;
    private javax.swing.JTextField productNameTxt;
    private javax.swing.JTable productTable;
    private javax.swing.JComboBox<String> productTypeActionBox;
    private javax.swing.JTable productTypeTable;
    private javax.swing.JButton refreshActionBtn;
    private javax.swing.JButton removeActionBtn;
    private javax.swing.JButton removePrdActionBtn;
    private javax.swing.JButton saveActionBtn;
    private javax.swing.JButton saveProdActionBtn;
    // End of variables declaration//GEN-END:variables
}
