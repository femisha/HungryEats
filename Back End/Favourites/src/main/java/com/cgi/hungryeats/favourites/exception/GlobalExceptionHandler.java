package com.cgi.hungryeats.favourites.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice

public class GlobalExceptionHandler {
	
	@ExceptionHandler({ FavouriteItemAlreadyExistsException.class }) 
	  public ResponseEntity<String> favoriteitemAlreadyExistsException() {
	  
	 return new ResponseEntity<String>("Item Already Exists",
	  HttpStatus.FOUND);	  
	  }
	
	@ExceptionHandler({ FavouriteItemNotFoundException.class }) 
	  public ResponseEntity<String> favoriteitemNotExistsException() {
	  
		return new ResponseEntity<String>("Favourite Item Not found",
				 HttpStatus.NOT_FOUND); }
		
	@ExceptionHandler({ FavouriteRestaurantAlreadyExistsException.class }) 
	  public ResponseEntity<String> favouriteRestaurantAlreadyExistsException() {
	  
	 return new ResponseEntity<String>("Restaurant Already Exists",
	  HttpStatus.FOUND);
	  
	  }
	
	@ExceptionHandler({ FavouriteRestaurantNotFoundException.class }) 
	  public ResponseEntity<String> favouriteRestaurantNotFoundException() {
	  
		return new ResponseEntity<String>("Favourite Restaurant Not found",
				 HttpStatus.NOT_FOUND); }
	
	

}
