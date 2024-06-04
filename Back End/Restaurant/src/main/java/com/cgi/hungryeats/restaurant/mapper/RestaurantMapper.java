package com.cgi.hungryeats.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import com.cgi.hungryeats.restaurant.dto.FoodDTO;
import com.cgi.hungryeats.restaurant.dto.RestaurantDTO;
import com.cgi.hungryeats.restaurant.entity.Food;
import com.cgi.hungryeats.restaurant.entity.Restaurant;



@Mapper(componentModel = "spring")
public interface RestaurantMapper {
	
 // List<RestaurantDTO> toListDTO(List<Restaurant> list);
	
	RestaurantDTO toDTO(Restaurant restaurant);
	FoodDTO toFoodDTO(Food food);
	
	Iterable<FoodDTO> toListFoodDTO(List<Food> list);
	Iterable<RestaurantDTO> toListRestaurantDTO(List<Restaurant> list);

}
