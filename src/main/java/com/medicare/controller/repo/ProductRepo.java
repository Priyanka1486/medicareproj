package com.medicare.controller.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.controller.entities.Product;


public interface ProductRepo extends JpaRepository<Product,Integer>{ 

}
