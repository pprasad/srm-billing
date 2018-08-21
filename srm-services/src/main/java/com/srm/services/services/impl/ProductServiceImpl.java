/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.services.services.impl;

import com.srm.services.modal.Product;
import com.srm.services.modal.ProductType;
import com.srm.services.repository.ProductRepository;
import com.srm.services.repository.ProductTypeRepository;
import com.srm.services.services.ProductService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author umprasad
 */
@Service
public class ProductServiceImpl implements ProductService{
    
    @Autowired 
    private ProductTypeRepository productTypeRepository;
    
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductType save(ProductType productType) {
        return productTypeRepository.insert(productType);
    }
    @Override
    public List<ProductType> save(List<ProductType> productTypes) {
       return productTypeRepository.insert(productTypes);
    }

    @Override
    public List<ProductType> findAllProdcutTypes() {
        return productTypeRepository.findAll();
    }

    @Override
    public void deleteProductType(ProductType productType) {
        productTypeRepository.delete(productType);
    }

    @Override
    public List<String> findAllProductTypes() {
        List<String> productTypes;
        productTypes=productTypeRepository.findAll().stream().map(ProductType::getProdctTypeName).collect(Collectors.toList());
        return productTypes;
    }
    @Override
    public Product save(Product product) {
       return productRepository.insert(product);
    }
    
    @Override
    public ProductType findProductTypeByName(String name) {
       return productTypeRepository.findByProdctTypeName(name);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
       productRepository.delete(product);
    }
}
