package com.eif.controller;

import com.eif.data.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eif.service.Product_Service;

@RestController
public class Product_Controller {

	@Autowired
	private Product_Service ps ;
	// Readin the products
	@GetMapping("/products")
	public List<Product> FindAllProducts(){
		return ps.getProducts();
	}
	
	// Add product to the DB
	@PostMapping("/add")
	public void addProduct(@RequestBody Product p ) {
		ps.saveProduct(p);
	}
	
	@GetMapping("/product/{Id}")
	public Product findbyId(@PathVariable int Id) {
		return ps.getbyId(Id);
	}
	
	@DeleteMapping("/product/{Id")
	public void deletebyID(@PathVariable int Id) {
		ps.delete(Id);
	}
	
	
	
	
	
	
}
