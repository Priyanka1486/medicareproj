package com.medicare.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.controller.entities.Category;
import com.medicare.controller.repo.CategoryRepo;

@Service
public class CategoryDao {

	@Autowired
	CategoryRepo repo;
	
	public Category insert(Category cat) {
		return repo.save(cat);
	}
	
	public List<Category> getAll(){
		return repo.findAll(); 
	}
	
	public Category getById(int id) {
		return repo.findById(id).orElse(null);
	}
	public String deleteById(int id) {
		repo.deleteById(id);
		return "Deleted Successfully";
	}
}
