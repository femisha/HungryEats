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

import com.cgi.hungryeats.order.dto.OrderDto;
import com.cgi.hungryeats.order.entity.Order;
import com.cgi.hungryeats.order.exception.OrderNotFoundException;
import com.cgi.hungryeats.order.service.IOrderService;

@RestController
@RequestMapping(value="/api/v1")
public class OrderController {
	
	@Autowired
	IOrderService service;
	
	@CrossOrigin
	@GetMapping("/Order")
    public OrderDto getOrderByid(@RequestBody int id) throws OrderNotFoundException {
		return service.getOrderByid(id);
	}
	@CrossOrigin
	@PostMapping("/Order")
	public OrderDto addOrder(@RequestBody Order order) {
		return service.addOrder(order);
	}
	@CrossOrigin
	@GetMapping("/Orders")
	public List<Order> getAllOrders(){
		return service.getAllOrders();
	}
	
	

}
