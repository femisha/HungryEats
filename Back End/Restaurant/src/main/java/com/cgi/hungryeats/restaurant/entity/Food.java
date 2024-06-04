package com.cgi.hungryeats.restaurant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="display")
public class Food {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int foodId;
	private  String foodName;
	private int price;
	private int quantity;
	

}
