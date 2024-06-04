package com.cgi.hungryeats.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.hungryeats.restaurant.dto.FoodDTO;
import com.cgi.hungryeats.restaurant.dto.RestaurantDTO;
import com.cgi.hungryeats.restaurant.entity.Food;
import com.cgi.hungryeats.restaurant.entity.Restaurant;
import com.cgi.hungryeats.restaurant.mapper.RestaurantMapper;
import com.cgi.hungryeats.restaurant.repository.RestaurantRepository;

 
 
@Service
public class RestaurantServiceImpl implements IRestaurantService {
	
	@Autowired
	 RestaurantMapper mapper;

	@Autowired
	RestaurantRepository repo;

	@Override
	public RestaurantDTO addRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
        Restaurant restaurantobj=repo.save(restaurant) ;
		
		return mapper.toDTO(restaurantobj);
		
	}

	@Override
	public RestaurantDTO updateRestuarant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		
        Restaurant restaurantobj=repo.save(restaurant) ;
		
		return mapper.toDTO(restaurantobj);
	}

	@Override
	public Iterable<RestaurantDTO> getAllRestaurant() {
		
		      List<Restaurant> list = (List<Restaurant>) repo.findAll();
				
				return mapper.toListRestaurantDTO(list);

				// TODO Auto-generated method stub
				
	
	}
	
	

}
