package com.cgi.hungryeats.order.dto;



import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class OrderDto {
		@Id
		private int foodId;
		private String foodName;
		private int quantity;
		private int price;
	
		

	}


