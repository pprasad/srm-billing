/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services.impl;

import com.srm.services.config.ServiceConstant;
import com.srm.services.modal.Dashboard;
import com.srm.services.modal.PurchaseStock;
import com.srm.services.modal.SalesBill;
import com.srm.services.modal.SalesBillStock;
import com.srm.services.repository.SalesBillRepository;
import com.srm.services.repository.SalesBillStockRepository;
import com.srm.services.services.SalesBillService;
import com.srm.services.services.SequenceService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Service;

/**
 *
 * @author umprasad
 */
@Service
public class SalesBillServiceImpl implements SalesBillService{
    
    private final static Logger LOGGER=LoggerFactory.getLogger(SalesBillServiceImpl.class);
   
    @Autowired
    private SalesBillRepository salesBillRepository;
    
    @Autowired
    private SalesBillStockRepository salesBillStockRepository;
    
    @Autowired
    private SequenceService sequenceService;
    
    @Autowired
    private MongoTemplate mongoTemplate;
    
    @Override
    public List<SalesBill> findAllBills() {
        return salesBillRepository.findAll();
    }

    @Override
    public SalesBill findBillById(String id) {
        return salesBillRepository.findOne(id);
    }

    @Override
    public List<SalesBillStock> findAllStock(String id) {
        return salesBillStockRepository.findBySalesBillNo(id);
    }

    @Override
    public SalesBill save(SalesBill salesBill) {
          if(salesBill!=null){
             Long seqValue=sequenceService.getLongSeq(ServiceConstant.SALES_BILL_SEQ);
             salesBill.setBillNo(seqValue.toString());
             salesBill=salesBillRepository.insert(salesBill);
          }
          return salesBill;
    }

  
    @Override
    public SalesBill update(SalesBill salesBill) {
        return salesBillRepository.save(salesBill);
    }

    @Override
    public SalesBillStock save(SalesBillStock salesBillStock) {
       return salesBillStockRepository.insert(salesBillStock);
    }

    @Override
    public List<SalesBillStock> saveStock(List<SalesBillStock> salesBillStocks) {
       return salesBillStockRepository.insert(salesBillStocks);
    }

    @Override
    public SalesBillStock update(SalesBillStock salesBillStock) {
         return salesBillStockRepository.save(salesBillStock);
    }

    @Override
    public List<SalesBillStock> updateStock(List<SalesBillStock> salesBillStocks) {
        return salesBillStockRepository.save(salesBillStocks);
    }

    @Override
    public void delete(SalesBill salesBill) {
       salesBillRepository.delete(salesBill);
    }

    @Override
    public void delete(List<SalesBill> salesBills) {
        salesBillRepository.delete(salesBills);
    }

    @Override
    public void delete(SalesBillStock salesBillStock) {
       salesBillStockRepository.delete(salesBillStock);
    }

    @Override
    public void deleteStock(List<SalesBillStock> salesBillStocks) {
        salesBillStockRepository.delete(salesBillStocks);
    }

    @Override
    public Dashboard findSalesStock() {
          Dashboard dashboard;
          Aggregation aggregation=Aggregation.newAggregation(Aggregation.group().sum("salesQty").as("salesStock").sum("qty").as("purchaseStock"));
          AggregationResults<Dashboard> anResults=mongoTemplate.aggregate(aggregation,PurchaseStock.class,Dashboard.class);
          dashboard=anResults.getUniqueMappedResult();
          LOGGER.info("FindSalesStock{}",dashboard.getSalesStock());
          return dashboard;
    } 
    
}
