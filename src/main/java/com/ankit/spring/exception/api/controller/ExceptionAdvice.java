package com.ankit.spring.exception.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ankit.spring.exception.api.customizedexception.OrderServiceException;
import com.ankit.spring.exception.api.model.OrderError;

@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler
	public ResponseEntity<OrderError> mapException(OrderServiceException ose) {
		OrderError error = new OrderError(HttpStatus.INTERNAL_SERVER_ERROR.value(), ose.getMessage());
		return new ResponseEntity<OrderError>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
