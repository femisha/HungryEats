package com.cgi.hungryeats.favourites.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cgi.hungryeats.favourites.entity.Favourites;


@Repository
public interface FavouritesRepository extends CrudRepository<Favourites, Integer> {


	
	
	

}
