package com.projeto.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.webservice.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
