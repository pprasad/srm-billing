/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.repository;

import com.srm.services.modal.Traders;
import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author umprasad
 */
public interface TradersRepository extends MongoRepository<Traders,String>{
    @Query(value ="{trader_name:?0}") 
    Traders findByTraderName(String name);
}
