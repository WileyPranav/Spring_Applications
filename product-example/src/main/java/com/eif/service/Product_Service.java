package com.eif.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eif.data.Product;
import com.eif.repo.Product_Repo;

@Service
public class Product_Service {

	@Autowired
	private Product_Repo pr ;
	
	public Product saveProduct(Product p) {
		return pr.save(p);
	}
	
	public List<Product> getProducts(){
		return pr.findAll();
	}
	public Product getbyId(int id) {
		return pr.findById(id).orElse(null);
	}
	
	public void delete(int id) {
		pr.deleteById(id);
	}
}
