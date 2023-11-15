package com.java;

public class Item {
	



	private String name;
	private Long Quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getQuantity() {
		return Quantity;
	}
	public void setQuantity(Long quantity) {
		Quantity = quantity;
	}
	public Item(String name, Long quantity) {
		super();
		this.name = name;
		Quantity = quantity;
	}
	public Item(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	
	
}


