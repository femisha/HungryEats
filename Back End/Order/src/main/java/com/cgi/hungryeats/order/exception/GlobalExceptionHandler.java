package com.cgi.hungryeats.order.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler({ OrderNotFoundException.class})
	public ResponseEntity<String> OrderNotFoundException(){
		 return new ResponseEntity<String>("Order Not Found",
				  HttpStatus.NOT_FOUND);
		
	}
	
	

	 

}
