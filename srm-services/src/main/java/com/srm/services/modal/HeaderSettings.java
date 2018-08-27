/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srm.services.modal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author umprasad
 */
@Document(collection="HeaderSettings")
public class HeaderSettings{
    
    @Id
    private ObjectId id;
    
    private String companyName;
    
    private String address;
    
    private String addressSub;
    
    private String contactNo;
    
    private String registrationNo;
    
    private String defaultUse;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressSub() {
        return addressSub;
    }

    public void setAddressSub(String addressSub) {
        this.addressSub = addressSub;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getDefaultUse() {
        return defaultUse;
    }

    public void setDefaultUse(String defaultUse) {
        this.defaultUse = defaultUse;
    }
    
    
}
