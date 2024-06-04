package com.cgi.hungryeats.restaurant.service;

import com.cgi.hungryeats.restaurant.dto.RestaurantDTO;
import com.cgi.hungryeats.restaurant.entity.Restaurant;

public interface IRestaurantService {
	

	public RestaurantDTO addRestaurant(Restaurant restaurant);
	
	public RestaurantDTO updateRestuarant(Restaurant restaurant);
	
	public Iterable<RestaurantDTO> getAllRestaurant();
	
	

}
