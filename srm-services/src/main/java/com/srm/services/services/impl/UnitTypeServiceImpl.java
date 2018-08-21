/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services.impl;

import com.srm.services.modal.UnitType;
import com.srm.services.repository.UnitRepository;
import com.srm.services.services.UnitTypeService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author umprasad
 */
@Service
public class UnitTypeServiceImpl implements UnitTypeService{
    
    private final static Logger LOGGER=LoggerFactory.getLogger(UnitTypeServiceImpl.class);
    
    @Autowired private UnitRepository unitRepository;

    @Override
    public UnitType findUnitById(String id) {
       return unitRepository.findOne(id);
    }

    @Override
    public List<UnitType> findAllUnitTypes() {
       return unitRepository.findAll();
    }

    @Override
    public UnitType save(UnitType unitType) {
        return unitRepository.save(unitType);
    }

    @Override
    public List<UnitType> save(List<UnitType> unitTypes) {
        return unitRepository.insert(unitTypes);
    }

    @Override
    public UnitType update(UnitType unitType) {
       return unitRepository.save(unitType);
    }

    @Override
    public List<UnitType> update(List<UnitType> unitTypes) {
        return unitRepository.save(unitTypes);
    }

    @Override
    public void delete(UnitType unitType) {
       unitRepository.delete(unitType);
    }

    @Override
    public void delete(List<UnitType> unitTypes) {
        unitRepository.delete(unitTypes);
    }

    @Override
    public void delete(String id) {
       unitRepository.delete(id);
    }
    
}
