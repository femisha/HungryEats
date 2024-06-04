package com.cgi.hungryeats.order.service;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.hungryeats.order.dto.CartDto;
import com.cgi.hungryeats.order.dto.OrderDto;
import com.cgi.hungryeats.order.entity.Cart;
import com.cgi.hungryeats.order.entity.Order;
import com.cgi.hungryeats.order.exception.OrderNotFoundException;
import com.cgi.hungryeats.order.repository.OrderRepository;
import com.cgi.hungryeats.order.mapper.OrderMapper;
@Service
public class IOrderService implements OrderService {
  
	
	
	@Autowired
	OrderMapper mapper;
	@Autowired
	OrderRepository repo;
	@Override
	public OrderDto getOrderByid(int id) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		Order orderobj = repo.findById(id).orElse(null);
		if(orderobj==null)
		{
		throw new OrderNotFoundException();
		}
		
	

		return mapper.toOrderDto(orderobj);
	}
	@Override
	public OrderDto addOrder(Order order) {
		// TODO Auto-generated method stub
		Order orderobj = repo.save(order);
		
		return mapper.toOrderDto(orderobj);
	}
	
	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		//List<Order> list = (List<Order>) repo.findAll();
		return repo.findAll();
	}
	
	
}
