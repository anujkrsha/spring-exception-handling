package com.javadev.spring.exp.handling.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javadev.spring.exp.handling.api.model.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {

	Order findByName(String name);

}
