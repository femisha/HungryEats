package com.cgi.hungryeats.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.hungryeats.order.dto.CartDto;
import com.cgi.hungryeats.order.dto.OrderDto;
import com.cgi.hungryeats.order.entity.Cart;
import com.cgi.hungryeats.order.service.ICartService;

@RestController
@RequestMapping(value="/api/v1")
public class CartContrller {
	@Autowired
	ICartService service;
	
    @CrossOrigin
	@PostMapping("/Cart")
	public CartDto addToCart(@RequestBody Cart cart) {
		return service.addToCart(cart);
	}
	@DeleteMapping(value="/Cart/{id}")
	public String  deleteById(@PathVariable int id) {
		
		
		 service.deleteFromCart(id);
		
		return " Deleted From Cart";
	}
	
	@CrossOrigin
	@GetMapping("/carts")
	public List<CartDto> getAllCart(){
		return service.getAllCart();
	}

}
