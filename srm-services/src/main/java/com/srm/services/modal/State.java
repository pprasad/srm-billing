/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.modal;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
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
     private List<City> citys;

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
    public List<City> getCitys() {
        return citys;
    }
    public void setCitys(List<City> citys) {
        this.citys = citys;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.stateCode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final State other = (State) obj;
        if (!Objects.equals(this.stateCode, other.stateCode)) {
            return false;
        }
        return true;
    }

   
    
    
}
