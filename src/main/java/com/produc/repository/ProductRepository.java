package com.produc.repository;

import com.produc.domen.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByLastName(String lastName);

    Optional<Product> findById(Long id);
}
