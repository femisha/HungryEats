package com.cgi.hungryeats.favourites.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.cgi.hungryeats.favourites.dto.FavouritesDTO;
import com.cgi.hungryeats.favourites.entity.Favourites;

@Mapper(componentModel = "spring")
public interface FavouritesMapper {
	
	Iterable<FavouritesDTO> toListDTO(List<Favourites> list);
	
	FavouritesDTO toFavouritesDTO(Favourites favourites);
	
	FavouritesDTO getFavouritesDTO(Optional<Favourites> favourites);

}

