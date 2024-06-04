package com.cgi.hungryeats.restaurant.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="display")
public class FoodDTO {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int foodId;
	private  String foodName;
	private int price;
	private int quantity;
	

}
