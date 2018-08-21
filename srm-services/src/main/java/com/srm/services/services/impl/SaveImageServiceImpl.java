/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services.impl;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFSDBFile;
import com.srm.services.services.SaveImageService;
import java.io.FileInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

/**
 *
 * @author umprasad
 */
@Service
public class SaveImageServiceImpl implements SaveImageService{
    
    private static final Logger LOGGER=LoggerFactory.getLogger(SaveImageServiceImpl.class);
    
    @Autowired
    private GridFsOperations gridFsOperations;

    @Override
    public String saveImage(String path) {
        String imageId=null;
        try{
            DBObject dBObject=new BasicDBObject();
            dBObject.put("type","image");
            imageId=gridFsOperations.store(new FileInputStream(path), dBObject).getId().toString();
        }catch(Exception ex){
            LOGGER.error("Exception{}",ex);
        }
       return imageId;
    }

    @Override
    public GridFSDBFile findImageById(String id) {
       return gridFsOperations.findOne(new Query(Criteria.where("_id").is(id)));
    }

    @Override
    public void deleteImage(String Id) {
        gridFsOperations.delete(new Query(Criteria.where("_id").is(Id)));
    }
    
}
