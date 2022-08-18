package com.projeto.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.webservice.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
