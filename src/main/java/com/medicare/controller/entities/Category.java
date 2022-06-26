package com.medicare.controller.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
@Data
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;

	/*	
	//@OneToMany(targetEntity=Product.class,mappedBy="category",cascade=CascadeType.ALL,fetch=FetchType.LAZY)    
	@OneToMany(mappedBy="category")
	@JsonBackReference
	private List<Product> products;	

	public void addProduct(Product prod) {
		this.products.add(prod);
	}
	
	public void removeProduct(Product prod) {
		this.products.remove(prod);
	}
	*/
}
