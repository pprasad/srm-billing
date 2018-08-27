/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services.impl;

import com.srm.services.modal.Sequence;
import com.srm.services.services.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

/**
 *
 * @author umprasad
 */
@Service
public class SequenceServiceImpl implements SequenceService{
    
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Integer getSequence(String id) {
        Query query=new Query(Criteria.where("seqId").is(id));
        Update update = new Update().inc("value",1);
        Sequence sequence=mongoTemplate.findAndModify(query,update,Sequence.class);
        return sequence.getValue().intValue();
    }

    @Override
    public Long getLongSeq(String id) {
        Query query=new Query(Criteria.where("seqId").is(id));
        Update update = new Update().inc("value",1);
        Sequence sequence=mongoTemplate.findAndModify(query,update,Sequence.class);
        return sequence.getValue();
    }
    
}
