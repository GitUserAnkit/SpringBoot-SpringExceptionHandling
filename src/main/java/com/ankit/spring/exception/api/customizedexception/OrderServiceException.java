package com.ankit.spring.exception.api.customizedexception;

public class OrderServiceException extends Exception {
	
	private static final long serialVersionUID = -820025001722622353L;

	public OrderServiceException(String message) {
		super(message);
	}

}
