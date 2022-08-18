package com.projeto.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
