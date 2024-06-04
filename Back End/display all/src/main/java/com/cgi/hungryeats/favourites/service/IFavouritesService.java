package com.cgi.hungryeats.favourites.service;

import org.springframework.stereotype.Service;

import com.cgi.hungryeats.favourites.dto.FavouritesDTO;
import com.cgi.hungryeats.favourites.entity.Favourites;
import com.cgi.hungryeats.favourites.exception.FavouriteItemAlreadyExistsException;
import com.cgi.hungryeats.favourites.exception.FavouriteItemNotFoundException;


@Service
public interface IFavouritesService {
	
	public FavouritesDTO addFavourites(Favourites fav) throws FavouriteItemAlreadyExistsException;
	
	

	public void deleteFavouriteById(int id);
	
	public Iterable<FavouritesDTO> getAllFavourites();
	
	


	


	
	
	
	
}


