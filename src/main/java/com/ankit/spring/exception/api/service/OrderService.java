package com.ankit.spring.exception.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.spring.exception.api.customizedexception.OrderServiceException;
import com.ankit.spring.exception.api.model.Order;
import com.ankit.spring.exception.api.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	public double amount;

	@PostConstruct
	public void OrderDB() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(101, "mobile", "electronics", 1000.00));
		orders.add(new Order(102, "bike", "vechicle", 90000.00));
		repository.save(orders);
	}

	public double getPrice(String productname) throws OrderServiceException {
		Order order = null;
		try {
			order = repository.findByName(productname);
			amount = order.getAmount();
		} catch (Exception e) {
			throw new OrderServiceException("order not found with product " + productname);
		}

		return order.getAmount();
	}

}
