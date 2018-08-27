/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services;

import com.srm.services.modal.Dashboard;
import com.srm.services.modal.SalesBill;
import com.srm.services.modal.SalesBillStock;
import java.util.List;

/**
 *
 * @author umprasad
 */
public interface SalesBillService {
    List<SalesBill> findAllBills();
    SalesBill findBillById(String id);
    List<SalesBillStock> findAllStock(String id);
    SalesBill save(SalesBill salesBill);
    SalesBill update(SalesBill salesBill);
    SalesBillStock save(SalesBillStock salesBillStock);
    List<SalesBillStock> saveStock(List<SalesBillStock> salesBillStocks);
    SalesBillStock update(SalesBillStock salesBillStock);
    List<SalesBillStock> updateStock(List<SalesBillStock> salesBillStocks);
    void delete(SalesBill salesBill);
    void delete(List<SalesBill> salesBills);
    void delete(SalesBillStock salesBillStock);
    void deleteStock(List<SalesBillStock> salesBillStocks);
    Dashboard findSalesStock();
 }
