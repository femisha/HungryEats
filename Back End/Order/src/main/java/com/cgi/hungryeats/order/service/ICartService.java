package com.cgi.hungryeats.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.hungryeats.order.dto.CartDto;
import com.cgi.hungryeats.order.entity.Cart;
import com.cgi.hungryeats.order.entity.Order;
import com.cgi.hungryeats.order.mapper.OrderMapper;
import com.cgi.hungryeats.order.repository.CartRepository;

@Service
public class ICartService implements CartService{
	
	@Autowired
	OrderMapper mapper;
	
	@Autowired
	CartRepository repo;

	@Override
	public CartDto addToCart(Cart cart) {
		// TODO Auto-generated method stub
		Cart cartobj = repo.save(cart);
		return mapper.toCartDto(cartobj);
	
	}

	@Override
	public void deleteFromCart(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public List<CartDto> getAllCart() {
		// TODO Auto-generated method stub
		List<Cart> list = (List<Cart>) repo.findAll();
		return mapper.toCartListDto(list);
		
	}

	
	
	

	
}
