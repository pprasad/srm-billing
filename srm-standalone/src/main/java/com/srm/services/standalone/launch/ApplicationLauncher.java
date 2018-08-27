/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.launch;
import com.srm.services.standalone.config.AppConfig;
import com.srm.services.standalone.utils.StandaloneUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author umprasad
 */
public class ApplicationLauncher {
    private final static Logger LOGGER=LoggerFactory.getLogger(ApplicationLauncher.class);
    public static void loadProperties(){
        try{
            File file=new File("systemproperties.properties");
            Properties  properties=new Properties();
            properties.load(new FileInputStream(file));
            System.setProperty("sun.java2d.dpiaware", "false");
            System.setProperty("is.hidpi","true");
            System.setProperty("awt.useSystemAAFontSettings","on");
            System.setProperty("sun.java2d.uiscale.enabled","true");
            System.setProperty("sun.java2d.uiScale",properties.getProperty("app.hdi"));
        }catch(Exception ex){
            LOGGER.error("Exception{}",ex);
        }
    }
    public static void main(String args[]) {
        loadProperties();
        SwingUtilities.invokeLater(() -> {
            SplashScreen splashScreen=new SplashScreen();
            StandaloneUtils.setScreenCenterLocation(splashScreen);
            splashScreen.show();
            splashScreen.setConfig(AppConfig.class);
        });
    }
}
