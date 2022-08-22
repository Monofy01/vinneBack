package com.brian.vinne.service;

import com.brian.vinne.model.Product;
import com.brian.vinne.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAllProducts();
    }

    @Override
    public Product findProdById(Integer sku) {
        return productRepository.findProdById(sku);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.addProduct(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.updateProduct(product);
    }

    @Override
    public List<Product> deleteProduct(Integer sku) {
        return productRepository.deleteProduct(sku);
    }

    @Override
    public List<Object> groupProduct() {
        return productRepository.groupProduct();
    }

    @Override
    public List<Object> productRange(Integer val1, Integer val2) {
        return productRepository.productRange(val1, val2);
    }
}
