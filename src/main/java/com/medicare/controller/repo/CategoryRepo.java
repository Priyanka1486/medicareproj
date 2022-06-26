package com.medicare.controller.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.controller.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{

}
