/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.utils;

import com.srm.services.config.ServiceConstant;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;


/**
 *
 * @author umprasad
 */
public class StandaloneUtils {
    private final static Logger LOGGER=LoggerFactory.getLogger(StandaloneUtils.class);
    public final static String COUNTRY_NODE="Country";
    public static void setScreenCenter(JFrame frame){
        try{
            LOGGER.info("******Started SetScreenCenter**********");
            frame.setLocationRelativeTo(null);
            
        }catch(Exception ex){
            LOGGER.error("Exception",ex);
        }
    }
    public static void setScreenCenter(JDialog jdialogForm,JFrame parent){
        jdialogForm.setLocationRelativeTo(parent);
        jdialogForm.setAlwaysOnTop(true);
        jdialogForm.show();
    }
    public static void setScreenCenter(JDialog jdialogForm,JComponent parent){
        jdialogForm.setLocationRelativeTo(parent);
        jdialogForm.setAlwaysOnTop(true);
        jdialogForm.show();
    }
    public static void dialogBox(Integer action,Component component){
       if(ServiceConstant.ACTION_SAVE.equals(action)){
         JOptionPane.showMessageDialog(component, ServiceConstant.SUCCESS_MSG, ServiceConstant.RESULT_SUCCESS,
                        JOptionPane.INFORMATION_MESSAGE);
       }else if(ServiceConstant.ACTION_UPDATE.equals(action)){
         JOptionPane.showMessageDialog(component, ServiceConstant.UPDATE_MSG, ServiceConstant.RESULT_SUCCESS,
                        JOptionPane.INFORMATION_MESSAGE);   
       }else if(ServiceConstant.ACTION_DELETE.equals(action)){
          JOptionPane.showMessageDialog(component, ServiceConstant.DETLE_MSG, ServiceConstant.RESULT_SUCCESS,
                        JOptionPane.INFORMATION_MESSAGE);   
       }else if(ServiceConstant.ACTION_LOGIN_FAILURE.equals(action)){
           JOptionPane.showMessageDialog(component, ServiceConstant.LOGIN_FAILURE_MSG, ServiceConstant.RESULT_FAIURE,
                        JOptionPane.WARNING_MESSAGE); 
       }
    }
     public static void dialogBox(String message,Component component){
         JOptionPane.showMessageDialog(component,message, ServiceConstant.RESULT_FAIURE,
                        JOptionPane.WARNING_MESSAGE); 
    }
    public static boolean emailValidation(String email,final StringBuilder builder){
        if(StringUtils.isEmpty(email)){
            builder.append(ServiceConstant.MANDATORY_EMAIL);
            return true;
        }else{
            return false;
        }
    } 
    public static boolean passwordValidation(String pwd,String cfPwd,final StringBuilder builder){
        if(!StringUtils.isEmpty(pwd) && !StringUtils.isEmpty(cfPwd)){
             if(pwd.equals(cfPwd)){
                 return false;
             }else{
                 builder.append("\n"+ServiceConstant.CONFIRM_PWD);
                 return true;
             } 
        }else{
            return true;
        }
    }
}
