package com.io;

import java.io.Serializable;

public class Student  implements Serializable
{

	private String name,email;
	private int age;
	private transient float weight;
	
	public Student()
	{
		
	}
	public Student(String name,String email,int age,float weight)
	{
		
		
		this.name=name;
		this.email=email;
		this.age=age;
		this.weight=weight;
	}
	
	public void getDetails()
	{
		
		System.out.println("name is "+name);
		System.out.println("age is"+age);
		System.out.println("Email is "+email);
		System.out.println("weight is "+weight);
	}
	
	
	
	
}
