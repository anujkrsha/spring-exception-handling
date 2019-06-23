package com.javadev.spring.exp.handling.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javadev.spring.exp.handling.api.dao.OrderDao;
import com.javadev.spring.exp.handling.api.exception.OrderServiceException;
import com.javadev.spring.exp.handling.api.model.Order;

@Service
public class OrderService {

	@Autowired
	private OrderDao dao;

	@PostConstruct
	public void addOrder2DB() {
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(875, "Mobile", "Electronics", 8000));
		orders.add(new Order(876, "Bike", "Automobile", 9000));
		dao.save(orders);
	}

	public double getPrice(String productName) throws OrderServiceException{
		Order order = null;
		double amount = 0;
		try {
			order = dao.findByName(productName);
			amount = order.getAmount();
		}catch (Exception e) {
			throw new OrderServiceException("order not found with product:"+productName);
		}
		return amount;
	}

}
