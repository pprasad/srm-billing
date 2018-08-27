/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.repository;

import com.srm.services.modal.SalesBill;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author umprasad
 */
public interface SalesBillRepository extends MongoRepository<SalesBill,String>{
    
}
