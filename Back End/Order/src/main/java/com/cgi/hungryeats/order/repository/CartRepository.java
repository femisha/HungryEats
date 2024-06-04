package com.cgi.hungryeats.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cgi.hungryeats.order.entity.Cart;
@Repository
public interface CartRepository extends CrudRepository<Cart, Integer>{

}
