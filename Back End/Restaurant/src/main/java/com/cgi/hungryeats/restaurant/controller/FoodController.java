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
import com.cgi.hungryeats.restaurant.entity.Food;
import com.cgi.hungryeats.restaurant.service.FoodServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class FoodController {
	
	@Autowired
	FoodServiceImpl service;
	@CrossOrigin
	@PostMapping("/food")
	public FoodDTO addFood(@RequestBody Food food) {
		return service.addFood(food);
	}
	@CrossOrigin
	@PutMapping("/food")
	public FoodDTO updateFood(@RequestBody Food food)
	{
		return service.updateFood(food);
	}
	@CrossOrigin
	@DeleteMapping("/food/{id}")
	public String  deleteById(@PathVariable int id) {
		
		
		 service.deleteFood(id);
		
		return "food Deleted Successfully";
		 
		}
	@CrossOrigin
	@GetMapping("/foods")
	public Iterable<FoodDTO> getAllFood()
	{
		return service.getAllFood();
	}
	@CrossOrigin
	@GetMapping("/food/{id}")
	public FoodDTO getFoodById(@PathVariable int id)  {
		return service.getFoodById(id);
	}

}
