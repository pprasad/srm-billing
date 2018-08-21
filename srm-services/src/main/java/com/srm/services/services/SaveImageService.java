/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services;

import com.mongodb.gridfs.GridFSDBFile;

/**
 *
 * @author umprasad
 */
public interface SaveImageService{
    String saveImage(String path);
    GridFSDBFile findImageById(String id);
    void deleteImage(String Id);
}
