package com.projeto.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.webservice.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
