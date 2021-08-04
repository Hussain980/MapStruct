package com.example.MapStructDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MapStructDemo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
