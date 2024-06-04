package com.cgi.hungryeats.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.hungryeats.restaurant.dto.FoodDTO;
import com.cgi.hungryeats.restaurant.dto.RestaurantDTO;
import com.cgi.hungryeats.restaurant.entity.Restaurant;
import com.cgi.hungryeats.restaurant.service.RestaurantServiceImpl;

@RestController
@RequestMapping(value="/api/v1")
public class RestaurantController {
	
	@Autowired
	RestaurantServiceImpl service;
	
	@CrossOrigin
	@PostMapping("/restaurant")
	public RestaurantDTO addRestaurant(@RequestBody Restaurant restaurant)
	{
		return service.addRestaurant(restaurant);
	}
	
	@PutMapping("/restaurant")
	public RestaurantDTO updateRestaurant(@RequestBody Restaurant restaurant)
	{
		return service.updateRestuarant(restaurant);
	}
	
	@CrossOrigin
	@GetMapping("/restaurants")
	public Iterable<RestaurantDTO> getAllRestaurant()
	{
		return service.getAllRestaurant();
	}
	
	
	
	}
