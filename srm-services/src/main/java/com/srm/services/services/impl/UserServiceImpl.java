/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services.impl;

import com.srm.services.modal.User;
import com.srm.services.repository.UserRepository;
import com.srm.services.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author umprasad
 */
@Service
public class UserServiceImpl implements UserService{
    
  @Autowired
  private UserRepository userRepository;

    public User save(User user) {
      User userInfo=userRepository.save(user);
      return userInfo;
    }
    
}
