package com.example.exception;

public class ProjectDateExpiredException extends RuntimeException{

	public  ProjectDateExpiredException(String message) {
		super(message);
	}
}
