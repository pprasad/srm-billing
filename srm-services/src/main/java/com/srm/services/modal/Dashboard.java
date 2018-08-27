/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.modal;

import java.io.Serializable;
import org.bson.types.ObjectId;

/**
 *
 * @author umprasad
 */
public class Dashboard implements Serializable{
    
    private ObjectId id;
    
    private Integer salesStock;
    
    private Integer purchaseStock;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Integer getSalesStock() {
        return salesStock;
    }

    public void setSalesStock(Integer salesStock) {
        this.salesStock = salesStock;
    }

    public Integer getPurchaseStock() {
        return purchaseStock;
    }

    public void setPurchaseStock(Integer purchaseStock) {
        this.purchaseStock = purchaseStock;
    }
    
    
    
}
