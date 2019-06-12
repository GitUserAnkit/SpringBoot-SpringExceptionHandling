package com.ankit.spring.exception.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.spring.exception.api.customizedexception.OrderServiceException;
import com.ankit.spring.exception.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;

	@GetMapping("/getprice/{productname}")
	public String getOrderPrice(@PathVariable String productname) throws OrderServiceException {
		double amount = service.getPrice(productname);
		return "Product price " + productname + " is " + amount;
	}

}
