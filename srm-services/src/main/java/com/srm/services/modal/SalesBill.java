/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.modal;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author umprasad
 */
@Document(collection = "SalesBill")
public class SalesBill implements Serializable{
    
    @Id
    private String billNo;
    
    @DBRef
    private Customer customer;
    
    private Date billDate;
    
    private Double netAmount;
    
    private Integer discount;
    
    private Integer gstTax;
    
    private Double amount;
    
    @Transient
    private List<SalesBillStock> salesBillStock;

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getGstTax() {
        return gstTax;
    }

    public void setGstTax(Integer gstTax) {
        this.gstTax = gstTax;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<SalesBillStock> getSalesBillStock() {
        return salesBillStock;
    }

    public void setSalesBillStock(List<SalesBillStock> salesBillStock) {
        this.salesBillStock = salesBillStock;
    }

    
}
