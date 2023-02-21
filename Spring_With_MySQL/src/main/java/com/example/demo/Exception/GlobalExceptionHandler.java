package com.example.demo.Exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.beans.factory.annotation.Autowired;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	public String HandleResourceNotFound(ResourceNotFoundException ex) {
		return ex.getMessage();
	}
}
