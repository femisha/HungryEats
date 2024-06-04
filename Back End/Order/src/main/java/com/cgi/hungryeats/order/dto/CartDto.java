package com.cgi.hungryeats.order.dto;

import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Data

public class CartDto {
	@Id
	private int foodId;
	private String foodName;
	private int quantity;
	private int price;

}
