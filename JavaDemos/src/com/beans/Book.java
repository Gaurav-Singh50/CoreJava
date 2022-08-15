package com.beans;

public class Book {
	String name;
	float price;
	
	
	@Override
	public String toString()//object is represented in the form of String
	{
		return name +" "+ price;
	}
	
	
	public Book(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
