package com.tsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
