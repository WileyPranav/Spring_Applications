package com.eif.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eif.data.Product;

public interface Product_Repo extends 
JpaRepository<Product, Integer>{

}
