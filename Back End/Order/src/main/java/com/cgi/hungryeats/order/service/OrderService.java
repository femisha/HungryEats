package com.cgi.hungryeats.order.service;

import java.util.List;

import com.cgi.hungryeats.order.dto.CartDto;
import com.cgi.hungryeats.order.dto.OrderDto;
import com.cgi.hungryeats.order.entity.Cart;
import com.cgi.hungryeats.order.entity.Order;
import com.cgi.hungryeats.order.exception.OrderNotFoundException;


public interface OrderService {
	
	public OrderDto getOrderByid(int id) throws OrderNotFoundException ;
	public OrderDto addOrder(Order order) ;
	
	public List<Order> getAllOrders();
	
	

}
