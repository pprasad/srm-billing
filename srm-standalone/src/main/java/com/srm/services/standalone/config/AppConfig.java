/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.standalone.config;

import com.srm.services.standalone.controller.CategoryForm;
import com.srm.services.standalone.controller.CountryForm;
import com.srm.services.standalone.controller.CustomerForm;
import com.srm.services.standalone.controller.PurchasesForm;
import com.srm.services.standalone.controller.SalesBillForm;
import com.srm.services.standalone.controller.SalesBillInfoForm;
import com.srm.services.standalone.controller.StockEntryForm;
import com.srm.services.standalone.controller.TradersForm;
import com.srm.services.standalone.controller.UnitTypeForm;
import com.srm.services.standalone.controller.UserSignForm;
import com.srm.services.standalone.launch.LoginForm;
import com.srm.services.standalone.settings.HeaderSetting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author umprasad
 */
@Configuration
@ComponentScan(basePackages ={"com.srm.services.*"})
public class AppConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(AppConfig.class);
    
    @Bean
    public LoginForm getLoginForm(){
        LoginForm loginForm=new LoginForm();
        return loginForm;
    }
    
    @Bean
    public CategoryForm getCategoryForm(){
        CategoryForm categoryForm=new CategoryForm(null, true);
        return categoryForm;
    }
    @Bean
    public TradersForm getTradersForm(){
        TradersForm tradersForm=new TradersForm(null,true);
        return tradersForm;
    }
    @Bean
    public PurchasesForm getPurchasesForm(){
        PurchasesForm purchasesForm=new PurchasesForm(null, true);
        return purchasesForm;
    }
    
    @Bean
    public UserSignForm getUserSignForm(){
        UserSignForm userSignForm=new UserSignForm(null,true);
        return userSignForm;
    }
    @Bean
    public CountryForm getCountryForm(){
        CountryForm countryForm=new CountryForm(null, true);
        return countryForm;
    }
    @Bean
    public StockEntryForm getStockEntryForm(){
        return new StockEntryForm(null, true);
    }
    @Bean
    public UnitTypeForm getUnitTypeForm(){
        return new UnitTypeForm(null, true);
    }
    @Bean
    public SalesBillForm getSalesBillForm(){
        return new SalesBillForm();
    }
    @Bean
    public CustomerForm getCustmerForm(){
        return new CustomerForm(null, true);
    }
    @Bean
    public SalesBillInfoForm getSalesBillInfo(){
        return new SalesBillInfoForm(null, true);
    }
    @Bean
    public HeaderSetting getHeaderSettings(){
        return new HeaderSetting();
    }
}