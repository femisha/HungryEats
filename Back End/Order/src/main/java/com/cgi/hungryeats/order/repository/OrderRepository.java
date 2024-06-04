package com.cgi.hungryeats.order.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cgi.hungryeats.order.entity.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {





	

}

	