/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services;

import com.srm.services.modal.HeaderSettings;
import com.srm.services.repository.HeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author umprasad
 */
@Service
public class HeaderServiceImpl implements HeaderService{

    @Autowired
    private HeaderRepository headerRepository;
    
    @Override
    public HeaderSettings findByCompanyName(String name) {
        return headerRepository.findByCompanyName(name);
    }

    @Override
    public HeaderSettings findByDefaultValue(String value) {
        return headerRepository.findByDefaultUse(value);
    }

    @Override
    public HeaderSettings save(HeaderSettings headerSettings) {
       return headerRepository.save(headerSettings);
    }

    @Override
    public void delete(HeaderSettings headerSettings) {
       headerRepository.delete(headerSettings);
    }
    
}
