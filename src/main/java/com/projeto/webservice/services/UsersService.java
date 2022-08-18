package com.projeto.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.webservice.entities.Users;
import com.projeto.webservice.repositories.UsersRepository;

@Service // @Component e @Service REGISTRA COMO COMPONENTE DO FRAMEWORK SPRING
public class UsersService {

	@Autowired
	private UsersRepository repository;
	
	public List<Users> findAll(){
		return repository.findAll();
	}
	
	public Users findById(Long id) {
		
		Optional <Users> obj = repository.findById(id);
		return obj.get();
	}
}
