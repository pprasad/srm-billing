/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services.impl;

import com.srm.services.modal.City;
import com.srm.services.modal.Country;
import com.srm.services.modal.State;
import com.srm.services.modal.User;
import com.srm.services.repository.CountryRepository;
import com.srm.services.repository.UserRepository;
import com.srm.services.services.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author umprasad
 */
@Service
public class UserServiceImpl implements UserService{
    
  private final static Logger LOGGER=LoggerFactory.getLogger(UserServiceImpl.class); 
    
  @Autowired
  private UserRepository userRepository;
  
  @Autowired
  private CountryRepository countryRepository;

    public User save(User user) {
      User userInfo=userRepository.insert(user);
      return userInfo;
    }
    @Override
    public List<Country> save(List<Country> countrys) {
        return countryRepository.save(countrys);
    }
    @Override
    public List<Country> findCountries() {
        return countryRepository.findAll();
    }
    @Override
    public List<Country> update(List<Country> countrys) {
       return countryRepository.insert(countrys);
    }
    @Override
    public void delete(Country country) {
       countryRepository.delete(country);
    }
    @Override
    public Country save(Country country) {
       return countryRepository.save(country);
    }
    @Override
    public List<State> findStatesByCoutryName(String name) {
        Country country=countryRepository.findByCountryName(name);
        return country.getStates();
    }

    @Override
    public List<String> findCityesByState(String name) {
       List<String> cities=null;
       try{
        Country country=countryRepository.findCitiesByState(name);
        if(country!=null){
           List<City> citys=country.getStates().stream().map(State::getCitys).findAny().get();
           if(citys!=null){
               cities=citys.stream().map(City::getCityName).collect(Collectors.toList());
           }
        }
       }catch(Exception ex){
           LOGGER.error("Citys{}",ex);
       }
       return cities;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User findById(String id) {
        return userRepository.findOne(id);
    }

}
