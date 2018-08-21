/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services;

import com.srm.services.modal.Country;
import com.srm.services.modal.ProductType;
import com.srm.services.modal.State;
import com.srm.services.modal.User;
import java.util.List;

/**
 *
 * @author umprasad
 */
public interface UserService {
    
    public User save(User user );
    
    public List<Country> save(List<Country> countrys);
    
    public List<Country> findCountries();
    
    public List<Country> update(List<Country> countrys);
    
    public void delete(Country country);
    
    public Country save(Country country);
    
    public List<State> findStatesByCoutryName(String name);
    
    public List<String> findCityesByState(String name);
    
    public List<User> findAllUsers();
    
    public User updateUser(User user);
    
    public void delete(User user);
    
   
   
}
