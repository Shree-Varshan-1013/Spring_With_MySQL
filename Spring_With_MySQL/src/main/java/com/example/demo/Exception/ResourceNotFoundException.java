package com.example.demo.Exception;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException() {
		super();
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
