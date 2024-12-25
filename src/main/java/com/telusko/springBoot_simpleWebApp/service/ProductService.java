package com.telusko.springBoot_simpleWebApp.service;

import com.telusko.springBoot_simpleWebApp.model.Product;
import com.telusko.springBoot_simpleWebApp.repository.ProductRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public Product getProductById(int id) {
        return productRepo.findById(id).orElse((new Product()));
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void updateProduct(Product product, int id) {
        Product productToUpdate = getProductById(id);
        productToUpdate.setProdName(product.getProdName());
        productToUpdate.setPrice(product.getPrice());

        productRepo.save(productToUpdate);
    }

    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }

    public List<Product> getProducts() {
        return productRepo.findAll();
    }
}
