package com.projeto.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.webservice.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	
	

}
