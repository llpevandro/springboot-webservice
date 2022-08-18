package com.projeto.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.webservice.entities.Category;
import com.projeto.webservice.repositories.CategoryRepository;

@Service // @Component e @Service REGISTRA COMO COMPONENTE DO FRAMEWORK SPRING
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		
		Optional <Category> obj = repository.findById(id);
		return obj.get();
	}
}
