package com.example.sha.springbootsellertestapp.service;

import com.example.sha.springbootsellertestapp.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProduct();
}
