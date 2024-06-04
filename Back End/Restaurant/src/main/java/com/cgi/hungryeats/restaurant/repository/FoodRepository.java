package com.cgi.hungryeats.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cgi.hungryeats.restaurant.entity.Food;

@Repository
public interface FoodRepository extends CrudRepository<Food, Integer> {

}
