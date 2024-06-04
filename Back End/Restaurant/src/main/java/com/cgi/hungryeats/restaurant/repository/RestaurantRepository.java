package com.cgi.hungryeats.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cgi.hungryeats.restaurant.entity.Food;
import com.cgi.hungryeats.restaurant.entity.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

	//Food save(Food food);

	
	

}
