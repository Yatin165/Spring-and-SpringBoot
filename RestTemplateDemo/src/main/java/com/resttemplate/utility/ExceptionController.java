package com.resttemplate.utility;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.resttemplate.exception.StudentNotAvailableException;

//central exception handler
@RestControllerAdvice
public class ExceptionController {

	//excepiton handler methods
	@ExceptionHandler(StudentNotAvailableException.class)
	public ResponseEntity<String> studentNotAvailableException(StudentNotAvailableException exception) {
		ErrorInfo errorinfo = new ErrorInfo();
		errorinfo.setErrorcode(HttpStatus.NOT_FOUND);
		errorinfo.setMessage(exception.getMessage());
		errorinfo.setTime(LocalDateTime.now());
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
}
