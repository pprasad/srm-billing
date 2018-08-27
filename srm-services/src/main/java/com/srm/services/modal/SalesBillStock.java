/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.modal;

import java.io.Serializable;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author umprasad
 */
@Document(collection =  "SalesStock")
public class SalesBillStock implements Serializable{
    
    @Id
    @Field(value ="_id")
    private ObjectId id;
     
    @DBRef 
    private Product product;
    
    private Double price;
    
    private Integer qty;
    
    @DBRef
    private UnitType unitType;
    
    private Double amount;
    
    private Integer discount;
    
    private Double netAmount;
    
    private String salesBillNo;
    
    private ObjectId refStockId;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public String getSalesBillNo() {
        return salesBillNo;
    }

    public void setSalesBillNo(String salesBillNo) {
        this.salesBillNo = salesBillNo;
    }

    public ObjectId getRefStockId() {
        return refStockId;
    }

    public void setRefStockId(ObjectId refStockId) {
        this.refStockId = refStockId;
    }
    
 }
