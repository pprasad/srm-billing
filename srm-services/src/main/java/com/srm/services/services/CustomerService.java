/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services;

import com.srm.services.modal.Customer;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author umprasad
 */
public interface CustomerService {
    List<Customer> findAllCustomers();
    Customer findCustomerById(ObjectId id);
    List<Customer> save(List<Customer> customers);
    Customer save(Customer customer);
    List<Customer> update(List<Customer> customers);
    Customer update(Customer customer);
    void delete(Customer customer);
    void delete(List<Customer> customers);
}
 