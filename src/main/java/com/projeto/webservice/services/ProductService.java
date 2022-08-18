package com.projeto.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.webservice.entities.Product;
import com.projeto.webservice.repositories.ProductRepository;

@Service // @Component e @Service REGISTRA COMO COMPONENTE DO FRAMEWORK SPRING
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		
		Optional <Product> obj = repository.findById(id);
		return obj.get();
	}
}
