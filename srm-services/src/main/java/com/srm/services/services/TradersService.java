/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services;

import com.srm.services.modal.PurchaseStock;
import com.srm.services.modal.Purchases;
import com.srm.services.modal.Traders;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author umprasad
 */
public interface TradersService {
    List<Traders> findAllTraders();
    Traders findTraderByName(String name);
    void deleteAllTrader(List<Traders> traderses);
    void deleteOneTrader(Traders traders);
    Traders save(Traders traders);
    Traders update(Traders traders);
    Integer getSequence(String id);
    List<Purchases> findAllPurchases();
    Purchases findByRefereNo(Integer refereNo);
    Purchases save(Purchases purchases);
    Purchases update(Purchases purchases);
    void remove(Purchases purchases);
    List<PurchaseStock> findAll();
    List<PurchaseStock> findStockByRefereNo(Integer refereNo);
    List<PurchaseStock> save(List<PurchaseStock> purchaseStocks);
    PurchaseStock save(PurchaseStock purchaseStock);
    void remove(PurchaseStock purchaseStock);
    void remove(List<PurchaseStock> purchaseStock);
    List<PurchaseStock> findByRefereNoAndDelete(Integer refereNo,boolean delete);
    List<PurchaseStock> findByDelete(boolean delete);
    List<PurchaseStock> findByIsTransferAndDelete(boolean IsTransfer,boolean delete);
    PurchaseStock findById(ObjectId id);
    
    
}
