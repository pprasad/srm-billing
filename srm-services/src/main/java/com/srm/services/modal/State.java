/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.modal;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author umprasad
 */
@Document
public class State  implements Serializable{
    
     @Id
     private Integer stateCode;
     private String stateName;

     public Integer getStateCode() {
        return stateCode;
     }
     public void setStateCode(Integer stateCode) {
        this.stateCode = stateCode;
     }
     public String getStateName() {
        return stateName;
     }
     public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
