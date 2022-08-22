package com.brian.vinne.service;

import com.brian.vinne.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();

    Product findProdById(Integer sku);

    Product addProduct(Product product);

    Product updateProduct(Product product);

    List<Product> deleteProduct(Integer sku);

    List<Object> groupProduct();

    List<Object> productRange(Integer val1, Integer val2);


}
