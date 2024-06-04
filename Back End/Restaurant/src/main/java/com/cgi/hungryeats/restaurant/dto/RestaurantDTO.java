package com.cgi.hungryeats.restaurant.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="restaurant")
public class RestaurantDTO {
	@Id
	private int rid;
	private String restaurantName;
	private String location;
	
	
}
