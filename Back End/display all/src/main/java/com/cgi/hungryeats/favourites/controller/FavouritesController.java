package com.cgi.hungryeats.favourites.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.hungryeats.favourites.dto.FavouritesDTO;
import com.cgi.hungryeats.favourites.entity.Favourites;
import com.cgi.hungryeats.favourites.exception.FavouriteItemAlreadyExistsException;
import com.cgi.hungryeats.favourites.exception.FavouriteItemNotFoundException;
import com.cgi.hungryeats.favourites.service.FavouritesServiceimpl;

@RestController
@RequestMapping(value="/api/v1")


public class FavouritesController {
	
	@Autowired
	FavouritesServiceimpl service;
	
	@CrossOrigin
	@PostMapping ("/display")
	public FavouritesDTO addFavourties(@RequestBody Favourites fav) throws FavouriteItemAlreadyExistsException {
		return service.addFavourites(fav);
	}
	
	
	
	@CrossOrigin
	@DeleteMapping("/display/{id}")
	public String deleteById(@RequestBody int id) {
		service.deleteFavouriteById(id);
		return "Favourite deleted succesfully";
	}
	
	@CrossOrigin
	@GetMapping("/displayAll")
	public Iterable<FavouritesDTO> getAllFavourites(){
		return service.getAllFavourites();
	}

	
	

}
