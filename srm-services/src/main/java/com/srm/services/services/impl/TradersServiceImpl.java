/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services.impl;

import com.srm.services.modal.PurchaseStock;
import com.srm.services.modal.Purchases;
import com.srm.services.modal.Traders;
import com.srm.services.repository.PurchaseStockRepository;
import com.srm.services.repository.PurchasesRepository;
import com.srm.services.repository.SequenceRepository;
import com.srm.services.repository.TradersRepository;
import com.srm.services.services.SequenceService;
import com.srm.services.services.TradersService;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author umprasad
 */
@Service
public class TradersServiceImpl implements TradersService{
    
    @Autowired
    private TradersRepository tradersRepository;
    
    @Autowired
    private MongoTemplate mongoTemplate;
    
    @Autowired
    private SequenceRepository sequenceRepository;
    
    @Autowired
    private PurchasesRepository  purchasesRepository;
    
    @Autowired
    private PurchaseStockRepository purchaseStockRepository;
    
    @Autowired
    private SequenceService sequenceService;

    @Override
    public List<Traders> findAllTraders() {
       return tradersRepository.findAll();
    }

    @Override
    public Traders findTraderByName(String name) {
        return tradersRepository.findByTraderName(name);
    }

    @Override
    public void deleteAllTrader(List<Traders> traderses) {
        tradersRepository.delete(traderses);
    }

    @Override
    public void deleteOneTrader(Traders traders) {
        tradersRepository.delete(traders);
    }

    @Override
    public Traders save(Traders traders) {
       return tradersRepository.insert(traders);
    }

    @Override
    public Traders update(Traders traders) {
       return tradersRepository.save(traders);
    }

    @Override
    public Integer getSequence(String id) {
        return sequenceService.getSequence(id);
    }

    @Override
    public List<Purchases> findAllPurchases() {
       return purchasesRepository.findAll();
    }

    @Override
    public Purchases findByRefereNo(Integer refereNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Purchases save(Purchases purchases) {
        return purchasesRepository.insert(purchases);
    }

    @Override
    public Purchases update(Purchases purchases) {
       return purchasesRepository.save(purchases);
    }

    @Override
    public void remove(Purchases purchases) {
        purchasesRepository.delete(purchases);
    }

    @Override
    public List<PurchaseStock> findAll() {
       return purchaseStockRepository.findAll();
    }

    @Override
    public List<PurchaseStock> save(List<PurchaseStock> purchaseStocks) {
       return purchaseStockRepository.save(purchaseStocks);
    }

    @Override
    public PurchaseStock save(PurchaseStock purchaseStock) {
        return purchaseStockRepository.save(purchaseStock);
    }

    @Override
    public void remove(PurchaseStock purchaseStock) {
       purchaseStockRepository.delete(purchaseStock);
    }

    @Override
    public List<PurchaseStock> findStockByRefereNo(Integer refereNo) {
       return purchaseStockRepository.findByRefereNo(refereNo);
    }

    @Override
    public List<PurchaseStock> findByRefereNoAndDelete(Integer refereNo, boolean delete) {
        return purchaseStockRepository.findByRefereNoAndDelete(refereNo, delete);
    }

    @Override
    public void remove(List<PurchaseStock> purchaseStock) {
        purchaseStockRepository.delete(purchaseStock);
    }

    @Override
    public List<PurchaseStock> findByDelete(boolean delete) {
       return purchaseStockRepository.findByDelete(delete);
    }

    @Override
    public List<PurchaseStock> findByIsTransferAndDelete(boolean IsTransfer, boolean delete) {
       return purchaseStockRepository.findByIsTransferAndDelete(IsTransfer,delete);
    }

    @Override
    public PurchaseStock findById(ObjectId id) {
       return purchaseStockRepository.findOne(id);
    }
    
}
