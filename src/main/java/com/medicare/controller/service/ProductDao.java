package com.medicare.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.medicare.controller.entities.Product;
import com.medicare.controller.repo.ProductRepo;

@Service
public class ProductDao {
	@Autowired
	ProductRepo repo;

	public Product getById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public Product insert(Product p) {
		return repo.save(p);
	}
	
	public List<Product> getAll(){
		return repo.findAll();	
	}
	
	public String deleteById(int id) {
		repo.deleteById(id);
		return "Deleted successfully";
	}
	public Product update(Product prod) {
		Product p = getById(prod.getId());
		p.setPrice(prod.getPrice());
		p.setProductName(prod.getProductName());
		return repo.save(p); 
	}

}
