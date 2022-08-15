package com.exception;

public class NameMatching
{

	void checkName(String name) throws NameNotFoundException
	{
		
		if(name.equals("Scott"))
		{
			
			System.out.println("hello"+name);
		}
		else {
			
			
			throw new NameNotFoundException();//explicitly throwing the exception
		}
		
	}
}
