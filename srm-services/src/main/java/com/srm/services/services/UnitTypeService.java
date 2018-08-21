/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services;

import com.srm.services.modal.UnitType;
import java.util.List;

/**
 *
 * @author umprasad
 */
public interface UnitTypeService {
    
    public UnitType findUnitById(String id);
    public List<UnitType> findAllUnitTypes();
    public UnitType save(UnitType unitType);
    public List<UnitType> save(List<UnitType> unitTypes);
    public UnitType update(UnitType unitType);
    public List<UnitType> update(List<UnitType> unitTypes);
    public void delete(UnitType unitType);
    public void delete(List<UnitType>  unitTypes);
    public void delete(String id);
    
}
