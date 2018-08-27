/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.launch;

import com.srm.services.modal.User;
import com.srm.services.services.UserService;
import com.srm.services.standalone.utils.StandaloneUtils;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Properties;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 *
 * @author umprasad
 */
public class SplashScreen extends javax.swing.JFrame {
    private final static Logger LOGGER=LoggerFactory.getLogger(SplashScreen.class);
    private final static int ONE_SECOND = 1000;
    private ApplicationContext applicationContext;
    private Timer timer;
    private int i=0;
    private Properties properties;

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
          setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          applyTheme();
          initComponents();
          timer=new Timer(ONE_SECOND, (ActionEvent e) -> {
              i+=5;
              statusBar.setValue(i);
              if(i==100){
                  startApp();
              }
          });
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
        jLabel1 = new javax.swing.JLabel();
        statusBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jXImagePanel1.setBackground(new java.awt.Color(102, 0, 255));

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Billing Software Application");

        statusBar.setForeground(new java.awt.Color(255, 51, 0));
        statusBar.setStringPainted(true);

        javax.swing.GroupLayout jXImagePanel1Layout = new javax.swing.GroupLayout(jXImagePanel1);
        jXImagePanel1.setLayout(jXImagePanel1Layout);
        jXImagePanel1Layout.setHorizontalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jXImagePanel1Layout.setVerticalGroup(
            jXImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXImagePanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
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

    public void exist(){
        timer.stop();
        this.dispose();
    }
    public void startTimer(){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               timer.start();
            }
        });
    }
    private static final WindowListener closeListener=new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            e.getWindow().dispose();
        }
       
    };
    public void setConfig(Class appConfig){
        startTimer();
        //SwingUtilities.updateComponentTreeUI(this);
        EventQueue.invokeLater(() -> {
            applicationContext=new AnnotationConfigApplicationContext(appConfig);
            UserService userService=applicationContext.getBean(UserService.class);
            User user=userService.findById("admin@gmail.com");
            if(user==null){
                User userInfo=new User();
                userInfo.setEmailId("admin@gmail.com");
                userInfo.setDisplayName("Administrator");
                userInfo.setPassword("tf3pssfVvJWzbiGkMUY0qg==");
                userService.save(userInfo);
            }
        });
    }
    public void applyTheme(){
       try{
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            UIManager.put("Table.rowHeight",40);
            UIManager.put("Table.columnHeight",100);
            UIManager.put("TextField.font",new Font("Times New Roman", 0, 20));
            UIManager.put("TextArea.font",new Font("Times New Roman", 0, 20));
            UIManager.put("ComboBox.font", new Font("Times New Roman",0,20));
            UIManager.put("Label.font",new java.awt.Font("Engravers MT", 0,18)); //Change the 8 to what ever you want
            UIManager.put("Button.font",new java.awt.Font("Tahoma", 0,16)); 
            UIManager.put("RadioButton.font", new Font("Dialog", Font.BOLD, 8)); 
            UIManager.put("CheckBox.font", new Font("Dialog", Font.BOLD, 8)); 
            UIManager.put("ColorChooser.font", new Font("Dialog", Font.BOLD, 8));
            UIManager.put("TabbedPane.font",new java.awt.Font("Engravers MT", 0,18));
            UIManager.put("TableHeader.font",new java.awt.Font("Tahoma",Font.BOLD,16));
            JDialog.setDefaultLookAndFeelDecorated(true);
            JFrame.setDefaultLookAndFeelDecorated(true);
        }catch(UnsupportedLookAndFeelException ex){
            LOGGER.error("ApplicationLauncher Exception",ex);
        }
    }
    public Object getInitinalize(Class appObj){
        return applicationContext.getBean(appObj);
    }
    public void startApp(){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginForm loginForm=applicationContext.getBean(LoginForm.class);
                exist();
                loginForm.show(true);
                StandaloneUtils.setScreenCenter(loginForm);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.srm.components.JXImagePanel jXImagePanel1;
    private javax.swing.JProgressBar statusBar;
    // End of variables declaration//GEN-END:variables
}
