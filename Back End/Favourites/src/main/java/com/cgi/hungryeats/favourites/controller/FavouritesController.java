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
import org.springframework.web.client.RestTemplate;

import com.cgi.hungryeats.favourites.dto.FavouritesDTO;
import com.cgi.hungryeats.favourites.entity.Favourites;
import com.cgi.hungryeats.favourites.exception.FavouriteItemAlreadyExistsException;
import com.cgi.hungryeats.favourites.exception.FavouriteItemNotFoundException;
import com.cgi.hungryeats.favourites.service.FavouritesServiceimpl;

@RestController
@RequestMapping(value="/api/v1")

public class FavouritesController {
	
	//@Autowired
	//RestTemplate restTemplate;
	
	@Autowired
	FavouritesServiceimpl service;
	
	@CrossOrigin
	@PostMapping ("/Favourites")
	public FavouritesDTO addFavourties(@RequestBody Favourites fav) throws FavouriteItemAlreadyExistsException {
		
		FavouritesDTO obj=service.addFavourites(fav);
		if(obj!=null)
		{
			throw new FavouriteItemAlreadyExistsException();
		}
		
		//Food food=restTemplate.getForObject("http://localhost:7052/api/v1/food",Food.class );
		//Favourites favourite=new Favourites();
		
		return obj;
		
		
		
		
		
	}
	@CrossOrigin
	@GetMapping("/favourite/{id}")
	public FavouritesDTO getFavourites(@RequestBody int id) throws FavouriteItemNotFoundException {
		return service.getFavourite(id);
	}
	
	@CrossOrigin
	@DeleteMapping("/favourite/{id}")
	public String deleteById(@PathVariable int id) {
		service.deleteFavouriteById(id);
		return "Favourite deleted succesfully";
	}
	
	@CrossOrigin
	@GetMapping("/favourites")
	public Iterable<FavouritesDTO> getAllFavourites(){
		return service.getAllFavourites();
	}

}
