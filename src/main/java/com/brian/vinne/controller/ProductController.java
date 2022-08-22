package com.brian.vinne.controller;

import com.brian.vinne.model.Category;
import com.brian.vinne.model.Product;
import com.brian.vinne.service.CategoryService;
import com.brian.vinne.service.ProductService;
import com.brian.vinne.service.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productService.findAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Product> getCategoryById(@PathVariable("id") Integer id) {
        Product product = productService.findProdById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addCategoryy(@RequestBody Product product) {
        Product addProduct = productService.addProduct(product);
        return new ResponseEntity<>(addProduct, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Product> updateCategory(@RequestBody Product product) {
        Product updateProduct = productService.updateProduct(product);
        return new ResponseEntity<>(updateProduct, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<List<Product>> deleteCategory(@PathVariable Integer id) {
        return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK);
    }

    @GetMapping("/group")
    public ResponseEntity<List<Object>> groupProduct() {
        List<Object> o = productService.groupProduct();
        return new ResponseEntity<>(o, HttpStatus.OK);
    }

    @GetMapping("/range/{val1}/{val2}")
    public ResponseEntity<List<Object>> productRange(@PathVariable Integer val1, @PathVariable Integer val2) {
        return new ResponseEntity<>(productService.productRange(val1, val2), HttpStatus.CREATED);
    }
}
