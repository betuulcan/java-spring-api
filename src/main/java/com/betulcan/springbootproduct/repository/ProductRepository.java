package com.betulcan.springbootproduct.repository;

import com.betulcan.springbootproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
