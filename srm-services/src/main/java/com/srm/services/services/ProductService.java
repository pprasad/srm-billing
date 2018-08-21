/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services;

import com.srm.services.modal.Product;
import com.srm.services.modal.ProductType;
import java.util.List;

/**
 *
 * @author umprasad
 */
public interface ProductService {
    ProductType save(ProductType productType);
    List<ProductType> save(List<ProductType> productTypes);
    List<ProductType> findAllProdcutTypes();
    void deleteProductType(ProductType productType);
    List<String> findAllProductTypes();
    Product save(Product product);
    ProductType findProductTypeByName(String name);
    List<Product> findAllProducts();
    Product update(Product product);
    void deleteProduct(Product product);
}
