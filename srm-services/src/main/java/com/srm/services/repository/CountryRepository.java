/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.repository;

import com.srm.services.modal.Country;
import com.srm.services.modal.State;
import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author umprasad
 */
public interface CountryRepository extends MongoRepository<Country,Integer>{
    Country findByCountryName(String countryName);
    @Query(value ="{states.stateName:?0}",fields ="{'states':1,_id:0}")
    Country findCitiesByState(String name);
}
