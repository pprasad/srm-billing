/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 *
 * @author umprasad
 */
@Configuration
@EnableMongoRepositories(basePackages="com.srm.services.repository")
@PropertySource("classpath:application.properties")
public class MongoConfig extends AbstractMongoConfiguration{
    
    @Value("${mongo.host}")
    private String host;
    
    @Value("${mongo.port}")
    private Integer port;
    
    @Value("${mongo.database}")
    private String dataBase;
    

    @Override
    protected String getDatabaseName() {
        return dataBase;
    }

    @Override
    public Mongo mongo() throws Exception {
       return new MongoClient(host,port);
    }
    
}
