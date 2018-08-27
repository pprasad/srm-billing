/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services;

/**
 *
 * @author umprasad
 */
public interface SequenceService {
    Integer  getSequence(String id);
    Long getLongSeq(String id);
}
