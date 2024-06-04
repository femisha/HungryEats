package com.cgi.hungryeats.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.hungryeats.restaurant.dto.FoodDTO;
import com.cgi.hungryeats.restaurant.dto.RestaurantDTO;
import com.cgi.hungryeats.restaurant.entity.Food;
import com.cgi.hungryeats.restaurant.entity.Restaurant;
import com.cgi.hungryeats.restaurant.mapper.RestaurantMapper;
import com.cgi.hungryeats.restaurant.repository.FoodRepository;
import com.cgi.hungryeats.restaurant.repository.RestaurantRepository;

@Service
public class FoodServiceImpl implements IFoodService {
	@Autowired
	 RestaurantMapper mapper;

	@Autowired
	FoodRepository repo;

	@Override
	public FoodDTO addFood(Food food) { 
	    Food foodobj = repo.save(food);
	    
		return mapper.toFoodDTO(food);
		
	}

	@Override
	public void deleteFood(int id) {
		 repo.deleteById(id);
		
	}

	@Override
	public FoodDTO updateFood(Food food) {
		
		Food foodobj=repo.save(food) ;
		
		return mapper.toFoodDTO(foodobj);
	}

	@Override
	public Iterable<FoodDTO> getAllFood() {
      List<Food> list = (List<Food>) repo.findAll();
		
		return mapper.toListFoodDTO(list);

		// TODO Auto-generated method stub
		
	}

	@Override
	public FoodDTO getFoodById(int id) {
		// TODO Auto-generated method stub
		Food favo=repo.findById(id).orElse(null);
		
		return mapper.toFoodDTO(favo);
	}
	
	}
	

 