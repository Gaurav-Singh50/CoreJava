package com.beans;

import java.util.Objects;

public class Customer 
{
	private String name;
	private int id;
	
	  @Override public int hashCode()//super class Object
	  {
	  System.out.println(Objects.hash(id, name));
	  
	  return Objects.hash(id, name); 
	  }
	  
	 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		System.out.println(this.getClass());
		if (this.getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return this.id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return name+id;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
