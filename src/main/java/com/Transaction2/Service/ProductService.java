package com.Transaction2.Service;

import com.Transaction2.Model.Products;
import com.Transaction2.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Products addProduct(Products products) {
        return productRepository.save(products);
    }
}
