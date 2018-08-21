/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author umprasad
 */
@Document(collection ="ProductType")
public class ProductType {
    
    @Id
    @Field("product_type_id")
    private Integer productTypeId;
   
    @Field("product_type_name")
    private String prodctTypeName;

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProdctTypeName() {
        return prodctTypeName;
    }

    public void setProdctTypeName(String prodctTypeName) {
        this.prodctTypeName = prodctTypeName;
    }
    
    
}
