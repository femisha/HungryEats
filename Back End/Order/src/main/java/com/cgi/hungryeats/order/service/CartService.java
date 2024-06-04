package com.cgi.hungryeats.order.service;

import java.util.List;

import com.cgi.hungryeats.order.dto.CartDto;
import com.cgi.hungryeats.order.entity.Cart;

public interface CartService {
	public  CartDto addToCart(Cart cart);
	
  public List<CartDto> getAllCart();
	
	
	public void deleteFromCart(int id);

}
