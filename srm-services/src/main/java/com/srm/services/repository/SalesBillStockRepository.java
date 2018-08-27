/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.repository;

import com.srm.services.modal.SalesBillStock;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author umprasad
 */
public interface SalesBillStockRepository extends MongoRepository<SalesBillStock,ObjectId>{
 
    List<SalesBillStock> findBySalesBillNo(String id);
}
