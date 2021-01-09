package com.lti.pms;

public class Product {
	private int id ;
	private String name;
	private int price;
	private int qty;
	
	public Product (int id , String name , int price, int qty) {
		this.id = id;
		this.name = name;
		this.setPrice(price);
		this.setQty(qty);
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProductID() {
		return id;
	}
	public String getProductName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	
	void setStudentID( int id) {
		this.id =id ;
	}
	void setStudentName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}


