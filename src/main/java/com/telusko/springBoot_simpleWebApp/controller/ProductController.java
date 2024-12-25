package com.telusko.springBoot_simpleWebApp.controller;

import com.telusko.springBoot_simpleWebApp.model.Product;
import com.telusko.springBoot_simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @RequestMapping("/products/{id}")
    public Product getProducts(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        service.addProduct(product);
    }

    @PutMapping("/products/{id}")
    public void addProduct(@RequestBody Product product, @PathVariable("id") int id) {
        service.updateProduct(product, id);
    }

    @DeleteMapping("/products/{id}")
    public void addProduct(@PathVariable("id") int id) {
        service.deleteProduct(id);
    }
}
