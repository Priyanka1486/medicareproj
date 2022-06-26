package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.medicare.controller.entities.Category;
import com.medicare.controller.entities.Product;
import com.medicare.controller.service.CategoryDao;
import com.medicare.controller.service.ProductDao;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class MedicareController {

	@Autowired
	CategoryDao category_dao;
	
	@Autowired
	ProductDao product_dao;
	
	//Category crud operation
	@GetMapping("/catlist")
	public List<Category> getAllCategory() {
		return category_dao.getAll();
	}
	@PostMapping("/insert")
	public Category insertCategory(@RequestBody Category cat) {
		return category_dao.insert(cat);
	}
	@DeleteMapping("/deleteCategory")
	public String  deleteCategory(int id) {
		return category_dao.deleteById(id);
	}

	///Product crud operation
 	@GetMapping("/getproduct")
	public Product getProduct(int id) {
		return product_dao.getById(id);
	}
/*
 	@PostMapping("/addproduct")
	public Product insertProduct1(@RequestBody Product prod,int cat_id ) {
		Category cat = category_dao.getById(cat_id);
	//	cat.addProduct(prod);
		prod.setCategory(cat);
		return product_dao.insert(prod);
	}
*/
 	@PostMapping("/addproduct")
	public Product insertProduct(@RequestBody Product prod) {
		int cat_id = prod.getCategory().getId();
		Category cat = category_dao.getById(cat_id);
	//	cat.addProduct(prod);
		prod.setCategory(cat);
		return product_dao.insert(prod);
	}
	@GetMapping("/allproducts")
	public List<Product> getAllProduct(){
		return product_dao.getAll();
	}
	@PatchMapping("/updateproduct")
	public Product updateProduct(@RequestBody Product prod) {
		return product_dao.update(prod); 
	}
	@DeleteMapping("/deleteproduct")
	public String deleteProduct(int id) {
		return product_dao.deleteById(id);
	}


}
