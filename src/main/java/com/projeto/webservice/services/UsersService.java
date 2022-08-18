package com.projeto.webservice.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.projeto.webservice.entities.Users;
import com.projeto.webservice.repositories.UsersRepository;
import com.projeto.webservice.services.exceptions.DatabaseException;
import com.projeto.webservice.services.exceptions.ResourceNotFoundException;

@Service // @Component e @Service REGISTRA COMO COMPONENTE DO FRAMEWORK SPRING
public class UsersService {

	@Autowired
	private UsersRepository repository;
	
	public List<Users> findAll(){
		return repository.findAll();
	}
	
	public Users findById(Long id) {
		
		Optional <Users> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Users insert(Users obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
		repository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException (id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException (e.getMessage());
		}
	}
	
	public Users update(Long id, Users obj) {	
		try {
		Users entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
		}
		catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(Users entity, Users obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
		
	}
}
