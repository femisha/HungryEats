package com.cgi.hungryeats.order.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name="OrderTable")
public class Order {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int foodId;
	
	private String foodName;
	private int quantity;
	private int price;

	

}
