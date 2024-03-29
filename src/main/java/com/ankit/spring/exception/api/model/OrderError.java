package com.ankit.spring.exception.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderError {
	private int errorCode;
	private String errorMessage;
}
