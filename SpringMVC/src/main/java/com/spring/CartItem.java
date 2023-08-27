package com.spring;

public class CartItem {
    private int id;
    private User user;
    private Book book;
    private int quantity;
	public CartItem(int id, User user, Book book, int quantity) {
		super();
		this.id = id;
		this.user = user;
		this.book = book;
		this.quantity = quantity;
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
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}

