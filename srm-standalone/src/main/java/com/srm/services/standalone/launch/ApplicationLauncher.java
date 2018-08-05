/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.launch;

import com.srm.services.standalone.config.AppConfig;
import com.srm.services.standalone.utils.StandaloneUtils;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author umprasad
 */
public class ApplicationLauncher {
    private final static Logger LOGGER=LoggerFactory.getLogger(ApplicationLauncher.class);
    public void startApp(){
        try{
            System.setProperty("sun.java2d.dpiaware", "false");
            //MetalLookAndFeel.setCurrentTheme(new SRMTheme());
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            UIManager.put("Table.rowHeight",35);
            UIManager.put("Table.columnHeight",70);
            UIManager.put("TextField.font",new Font("Times New Roman", 0, 20));
            UIManager.put("TextArea.font",new Font("Times New Roman", 0, 20));
            UIManager.put("ComboBox.font", new Font("Times New Roman",0,20)); 
            JDialog.setDefaultLookAndFeelDecorated(true);
            ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
            LoginForm loginForm=applicationContext.getBean(LoginForm.class);
            StandaloneUtils.setScreenCenter(loginForm);
            loginForm.show();
        }catch(Exception ex){
            LOGGER.error("ApplicationLauncher Exception",ex);
        }
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               new ApplicationLauncher().startApp();
            }
        });
    }
}
