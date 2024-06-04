package com.cgi.hungryeats.restaurant.service;

import com.cgi.hungryeats.restaurant.dto.FoodDTO;
import com.cgi.hungryeats.restaurant.entity.Food;

public interface IFoodService {
	
   public FoodDTO addFood(Food food);
	
	//public List<ResturantDTO> getAllFavoriteFood();
	
	public FoodDTO updateFood(Food food);
	
	public void deleteFood(int id);
	
	public Iterable<FoodDTO> getAllFood();
	
	public FoodDTO getFoodById(int id);

}
