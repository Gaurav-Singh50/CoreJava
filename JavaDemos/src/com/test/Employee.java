package com.test;

public class Employee {
	
	String name;
	
	public Employee(String name) 
	{
		this.name=name;
		
	}
	
	void getInfo()
	{
		
		
		System.out.println("hello"+name);
	}
	
	@Override
	public String toString()//super class object
	{
		
		return "This is employee class "+name;
	}
	
}
