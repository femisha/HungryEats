package com.cgi.hungryeats.favourites.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.hungryeats.favourites.dto.FavouritesDTO;
import com.cgi.hungryeats.favourites.entity.Favourites;
import com.cgi.hungryeats.favourites.exception.FavouriteItemAlreadyExistsException;
import com.cgi.hungryeats.favourites.exception.FavouriteItemNotFoundException;
import com.cgi.hungryeats.favourites.mapper.FavouritesMapper;
import com.cgi.hungryeats.favourites.repository.FavouritesRepository;

@Service
public class FavouritesServiceimpl implements IFavouritesService {

	@Autowired
	FavouritesMapper mapper;
	
	@Autowired
	FavouritesRepository repo;

	

	@Override
	public FavouritesDTO addFavourites(Favourites fav) throws FavouriteItemAlreadyExistsException {
		
		// TODO Auto-generated method stub
		Favourites favobj = repo.save(fav);
		
		return mapper.toFavouritesDTO(favobj);
	}
	
	
	@Override
	
	public void deleteFavouriteById(int id) {
		// TODO Auto-generated method stub
		
		 repo.deleteById(id);
	}
	
	 
	

	@Override
	public Iterable<FavouritesDTO> getAllFavourites() {
		// TODO Auto-generated method stub
		
		List<Favourites> list = (List<Favourites>) repo.findAll();
		
		return mapper.toListDTO(list);
	}
	
	@Override
	public FavouritesDTO getFavourite(int id) throws FavouriteItemNotFoundException {
		
		Favourites favo=repo.findById(id).orElse(null);
		if(favo==null)
		{
		throw new FavouriteItemNotFoundException();

		}
		return mapper.toFavouritesDTO(favo);
	}
	


	
	
}
