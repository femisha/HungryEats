package com.cgi.hungryeats.order.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.cgi.hungryeats.order.dto.CartDto;
import com.cgi.hungryeats.order.dto.OrderDto;
import com.cgi.hungryeats.order.entity.Cart;
import com.cgi.hungryeats.order.entity.Order;


@Mapper(componentModel = "spring")

public interface OrderMapper {
	
	
	
	List<OrderDto>  toListDto(List<Order> list);
	OrderDto toOrderDto(Order order);
	
	CartDto toCartDto(Cart cart);
	List<CartDto>  toCartListDto(List<Cart> list);
	



}
