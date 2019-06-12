package com.ankit.spring.exception.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankit.spring.exception.api.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	Order findByName(String productname);

}
