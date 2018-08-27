/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.controller;

import com.srm.services.modal.Dashboard;
import com.srm.services.modal.PurchaseStock;
import com.srm.services.modal.SalesBillStock;
import com.srm.services.services.SalesBillService;
import com.srm.services.services.TradersService;
import com.srm.services.standalone.launch.LoginForm;
import com.srm.services.standalone.model.UserInfoSession;
import com.srm.services.standalone.settings.HeaderSetting;
import com.srm.services.standalone.utils.StandaloneUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author umprasad
 */
@Component
public class LandingForm extends javax.swing.JFrame {

    private final static Integer ONE_DELAY=1000;  
    /**
     * Creates new form LandingForm
     */
    public LandingForm() {
        progressBar=new Timer(ONE_DELAY,listener);
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

        jPanel1 = new javax.swing.JPanel();
        jXImagePanel2 = new com.srm.components.JXImagePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        singInLabel = new javax.swing.JLabel();
        logOutActionBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jXImagePanel1 = new com.srm.components.JXImagePanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jXImagePanel4 = new com.srm.components.JXImagePanel();
        jLabel5 = new javax.swing.JLabel();
        purchaseStockLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        salesStockLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jXImagePanel5 = new com.srm.components.JXImagePanel();
        jXImagePanel3 = new com.srm.components.JXImagePanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        stockActionBtn = new javax.swing.JButton();
        jXImagePanel6 = new com.srm.components.JXImagePanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        unitTypeActionBtn = new javax.swing.JButton();
        headerSettingActionBtn = new javax.swing.JButton();
        jXImagePanel7 = new com.srm.components.JXImagePanel();
        salesBillActionBtn = new javax.swing.JButton();
        jXStatusBar1 = new com.srm.components.JXStatusBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jXImagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerbg.jpg"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 8, 8));
        jLabel1.setText("SR Novelties");

        javax.swing.GroupLayout jXImagePanel2Layout = new javax.swing.GroupLayout(jXImagePanel2);
        jXImagePanel2.setLayout(jXImagePanel2Layout);
        jXImagePanel2Layout.setHorizontalGroup(
            jXImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jXImagePanel2Layout.setVerticalGroup(
            jXImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jLabel4.setText("Sing In");

        singInLabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        singInLabel.setForeground(new java.awt.Color(204, 102, 0));
        singInLabel.setText("Sing In");

        logOutActionBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        logOutActionBtn.setText("LogOut");
        logOutActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jXImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(singInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutActionBtn)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jXImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(singInLabel)
                    .addComponent(logOutActionBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N

        jXImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/app-background.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setBackground(new java.awt.Color(155, 25, 93));
        jLabel2.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Stock Details");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);

        jXImagePanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/warehouse.png"))); // NOI18N

        javax.swing.GroupLayout jXImagePanel4Layout = new javax.swing.GroupLayout(jXImagePanel4);
        jXImagePanel4.setLayout(jXImagePanel4Layout);
        jXImagePanel4Layout.setHorizontalGroup(
            jXImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jXImagePanel4Layout.setVerticalGroup(
            jXImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabel5.setText("PURchase stock");

        purchaseStockLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        purchaseStockLabel.setText("0");

        jLabel6.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabel6.setText("sales stock");

        salesStockLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salesStockLabel.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXImagePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salesStockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(purchaseStockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jXImagePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(purchaseStockLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salesStockLabel)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setBackground(new java.awt.Color(155, 25, 93));
        jLabel3.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Transaction Details");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);

        jXImagePanel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png"))); // NOI18N

        javax.swing.GroupLayout jXImagePanel5Layout = new javax.swing.GroupLayout(jXImagePanel5);
        jXImagePanel5.setLayout(jXImagePanel5Layout);
        jXImagePanel5Layout.setHorizontalGroup(
            jXImagePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jXImagePanel5Layout.setVerticalGroup(
            jXImagePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXImagePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jXImagePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jXImagePanel1Layout = new javax.swing.GroupLayout(jXImagePanel1);
        jXImagePanel1.setLayout(jXImagePanel1Layout);
        jXImagePanel1Layout.setHorizontalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXImagePanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(591, Short.MAX_VALUE))
        );
        jXImagePanel1Layout.setVerticalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DASHBOARD", jXImagePanel1);

        jXImagePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/app-background.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        jButton1.setText("Category");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/meeting.png"))); // NOI18N
        jButton2.setText("traders");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerifyInputWhenFocusTarget(false);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart.png"))); // NOI18N
        jButton3.setText("purchases");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerifyInputWhenFocusTarget(false);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        stockActionBtn.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        stockActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stockicon_32.png"))); // NOI18N
        stockActionBtn.setText("stock");
        stockActionBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stockActionBtn.setVerifyInputWhenFocusTarget(false);
        stockActionBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        stockActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXImagePanel3Layout = new javax.swing.GroupLayout(jXImagePanel3);
        jXImagePanel3.setLayout(jXImagePanel3Layout);
        jXImagePanel3Layout.setHorizontalGroup(
            jXImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stockActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(485, Short.MAX_VALUE))
        );
        jXImagePanel3Layout.setVerticalGroup(
            jXImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jXImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stockActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(389, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("stock", jXImagePanel3);

        jXImagePanel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/app-background.png"))); // NOI18N

        jButton4.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_sign.png"))); // NOI18N
        jButton4.setText("users");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerifyInputWhenFocusTarget(false);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/earth-globe.png"))); // NOI18N
        jButton5.setText("country");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerifyInputWhenFocusTarget(false);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        unitTypeActionBtn.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        unitTypeActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-filter-30.png"))); // NOI18N
        unitTypeActionBtn.setText("units");
        unitTypeActionBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        unitTypeActionBtn.setVerifyInputWhenFocusTarget(false);
        unitTypeActionBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        unitTypeActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitTypeActionBtnActionPerformed(evt);
            }
        });

        headerSettingActionBtn.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        headerSettingActionBtn.setText("Header");
        headerSettingActionBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        headerSettingActionBtn.setVerifyInputWhenFocusTarget(false);
        headerSettingActionBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        headerSettingActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headerSettingActionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXImagePanel6Layout = new javax.swing.GroupLayout(jXImagePanel6);
        jXImagePanel6.setLayout(jXImagePanel6Layout);
        jXImagePanel6Layout.setHorizontalGroup(
            jXImagePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel6Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitTypeActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerSettingActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(555, Short.MAX_VALUE))
        );
        jXImagePanel6Layout.setVerticalGroup(
            jXImagePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel6Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jXImagePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerSettingActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitTypeActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(427, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("settings", jXImagePanel6);

        jXImagePanel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/app-background.png"))); // NOI18N

        salesBillActionBtn.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        salesBillActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoice-64.png"))); // NOI18N
        salesBillActionBtn.setText("sales bill");
        salesBillActionBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salesBillActionBtn.setVerifyInputWhenFocusTarget(false);
        salesBillActionBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salesBillActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesBillActionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXImagePanel7Layout = new javax.swing.GroupLayout(jXImagePanel7);
        jXImagePanel7.setLayout(jXImagePanel7Layout);
        jXImagePanel7Layout.setHorizontalGroup(
            jXImagePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel7Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(salesBillActionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1123, Short.MAX_VALUE))
        );
        jXImagePanel7Layout.setVerticalGroup(
            jXImagePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel7Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(salesBillActionBtn)
                .addContainerGap(429, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("sales bill", jXImagePanel7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jXStatusBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXStatusBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StandaloneUtils.setScreenCenter(categoryForm, this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StandaloneUtils.setScreenCenter(tradersForm, this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        purchasesForm.loadData();
        StandaloneUtils.setScreenCenter(purchasesForm, this);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        StandaloneUtils.setScreenCenter(userSignForm,this);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        StandaloneUtils.setScreenCenter(countryForm, this);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void stockActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionBtnActionPerformed
        stockEntryForm.load();
        StandaloneUtils.setScreenCenter(stockEntryForm,this);
    }//GEN-LAST:event_stockActionBtnActionPerformed

    private void unitTypeActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitTypeActionBtnActionPerformed
        unitTypeForm.loadInitalData();
        StandaloneUtils.setScreenCenter(unitTypeForm, this);
    }//GEN-LAST:event_unitTypeActionBtnActionPerformed

    private void salesBillActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesBillActionBtnActionPerformed
        salesBillForm.setAlwaysOnTop(true);
        StandaloneUtils.setScreenCenter(salesBillForm);
        salesBillForm.show();
    }//GEN-LAST:event_salesBillActionBtnActionPerformed

    private void logOutActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionBtnActionPerformed
        this.show(false);
        loginForm.show();
    }//GEN-LAST:event_logOutActionBtnActionPerformed

    private void headerSettingActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headerSettingActionBtnActionPerformed
        StandaloneUtils.setScreenCenter(headerSetting,rootPane);
    }//GEN-LAST:event_headerSettingActionBtnActionPerformed
    public void startSpinner(){
        progressBar.start();
    }
    public void stopSpinner(){
        progressBar.stop();
        jXStatusBar1.getjProgressBar1().setValue(0);
    }
    private ActionListener listener=new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                index+=5;
                JProgressBar jProgressBar=jXStatusBar1.getjProgressBar1();
                jProgressBar.setValue(index);
                jProgressBar.setStringPainted(true);
            }
    };
    private ActionListener updateStockDetails=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           
        }
    };
    public void updateStockDetails(List<SalesBillStock> salesBillStocks,Boolean flag){
        if(salesBillStocks!=null){
            startSpinner();
            for(SalesBillStock salesBillStock:salesBillStocks){
                PurchaseStock purchaseStock=tradersService.findById(salesBillStock.getRefStockId());
                if(purchaseStock!=null){
                    Integer qty=salesBillStock.getQty();
                    if(flag){
                         qty=qty-(purchaseStock.getSalesQty()!=null?purchaseStock.getSalesQty():0);
                    }else{
                        if(purchaseStock.getSalesQty()!=null){
                            qty=purchaseStock.getSalesQty()+qty;
                        }
                    }
                    purchaseStock.setSalesQty(qty);
                    tradersService.save(purchaseStock);
                }
            }
            stopSpinner();
        }
    }
    public void loadData(){
        singInLabel.setText(userInfoSession.getDisplayName());
        Dashboard dashboard=salesBillService.findSalesStock();
        if(dashboard!=null){
            salesStockLabel.setText(dashboard.getSalesStock().toString());
            purchaseStockLabel.setText(dashboard.getPurchaseStock().toString());
        }
    }
    @Autowired private CountryForm countryForm;
    @Autowired private CategoryForm categoryForm;
    @Autowired private TradersForm tradersForm;
    @Autowired private PurchasesForm purchasesForm;
    @Autowired private UserSignForm userSignForm;
    @Autowired private StockEntryForm stockEntryForm;
    @Autowired private UnitTypeForm unitTypeForm;
    @Autowired private SalesBillForm salesBillForm;
    @Autowired private UserInfoSession userInfoSession;
    @Autowired private LoginForm loginForm;
    @Autowired private HeaderSetting headerSetting;
    /*Services*/
    @Autowired private TradersService tradersService;
    @Autowired private SalesBillService salesBillService;
    private javax.swing.Timer progressBar;
    private static Integer index=10;
    private final static Logger LOGGER=LoggerFactory.getLogger(LandingForm.class);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton headerSettingActionBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.srm.components.JXImagePanel jXImagePanel1;
    private com.srm.components.JXImagePanel jXImagePanel2;
    private com.srm.components.JXImagePanel jXImagePanel3;
    private com.srm.components.JXImagePanel jXImagePanel4;
    private com.srm.components.JXImagePanel jXImagePanel5;
    private com.srm.components.JXImagePanel jXImagePanel6;
    private com.srm.components.JXImagePanel jXImagePanel7;
    private com.srm.components.JXStatusBar jXStatusBar1;
    private javax.swing.JButton logOutActionBtn;
    private javax.swing.JLabel purchaseStockLabel;
    private javax.swing.JButton salesBillActionBtn;
    private javax.swing.JLabel salesStockLabel;
    private javax.swing.JLabel singInLabel;
    private javax.swing.JButton stockActionBtn;
    private javax.swing.JButton unitTypeActionBtn;
    // End of variables declaration//GEN-END:variables
}
