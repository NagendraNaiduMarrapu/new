package com.spring;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private User user;
    private LocalDateTime orderDate;
	public Order(int id, User user, LocalDateTime orderDate) {
		super();
		this.id = id;
		this.user = user;
		this.orderDate = orderDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

    
}

