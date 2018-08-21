/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.repository;

import com.srm.services.modal.PurchaseStock;
import java.io.Serializable;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author umprasad
 */
public interface PurchaseStockRepository extends MongoRepository<PurchaseStock,ObjectId>{
    List<PurchaseStock> findByRefereNo(Integer refereNo);
    List<PurchaseStock> findByRefereNoAndDelete(Integer refereNo,boolean delete);
    List<PurchaseStock> findByDelete(boolean delete);
    List<PurchaseStock> findByIsTransferAndDelete(boolean IsTransfer,boolean delete);
}
