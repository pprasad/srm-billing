/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.repository;

import com.srm.services.modal.Sequence;
import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author umprasad
 */
public interface SequenceRepository extends MongoRepository<Sequence,String>{
    @Query(value ="{_id:?0},{$inc:{value:1}}",fields ="{value:1}",count =true)
    Integer findAndModify(String id);
}
