package com.produc.service;

import com.produc.domen.Product;
import com.produc.repository.ProductRepository;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product save(Product product1) {
        return repository.save(product1);
    }


    public Object findAll() {
        return  repository.findAll();
    }
}
