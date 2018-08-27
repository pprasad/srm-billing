/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services.impl;

import com.srm.services.modal.Customer;
import com.srm.services.repository.CustomerRepository;
import com.srm.services.services.CustomerService;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author umprasad
 */
@Service
public class CustomerServiceImpl implements  CustomerService{
    
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findCustomerById(ObjectId id) {
        return customerRepository.findOne(id);
    }

    @Override
    public List<Customer> save(List<Customer> customers) {
        return customerRepository.insert(customers);
    }

    @Override
    public Customer save(Customer customer) {
       return customerRepository.insert(customer);
    }

    @Override
    public List<Customer> update(List<Customer> customers) {
        return customerRepository.save(customers);
    }

    @Override
    public Customer update(Customer customer) {
       return customerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void delete(List<Customer> customers) {
        customerRepository.delete(customers);
    }
    
}
