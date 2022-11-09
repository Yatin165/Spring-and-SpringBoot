package com.example.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


	@RestControllerAdvice
	public class ExceptionController {

		@ExceptionHandler
		public ResponseEntity<String> employeeNotAvailableException(Exception exception) {
			return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
//	@ExceptionHandler
//	public ResponseEntity<ErrorInfo> handleEmployeeAPIException(MethodArgumentNotValidException exception){
//		ErrorInfo error=new ErrorInfo();
//		String message = exception.getBindingResult().getAllErrors().stream().map(m -> m.getDefaultMessage())
//				.collect(Collectors.joining(","));
//		error.setErrorcode(HttpStatus.BAD_REQUEST);
//		error.setMessage(message);
//		error.setTime(LocalDateTime.now());
//		return new ResponseEntity<ErrorInfo>(error, HttpStatus.NOT_FOUND);
//	}


