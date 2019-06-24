package com.javadev.spring.exp.handling.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ORDER_TBL")
public class Order {
	@Id
	private int id;
	private String name;
	private String catagories;
	private double amount;
	
	public Order() {
		
	}
	public Order(int id, String name, String catagories, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.catagories = catagories;
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatagories() {
		return catagories;
	}
	public void setCatagories(String catagories) {
		this.catagories = catagories;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
