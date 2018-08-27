/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services;

import com.srm.services.modal.HeaderSettings;

/**
 *
 * @author umprasad
 */
public interface HeaderService {
    HeaderSettings findByCompanyName(String name);
    HeaderSettings findByDefaultValue(String value);
    HeaderSettings save(HeaderSettings headerSettings);
    void delete(HeaderSettings headerSettings);
}
