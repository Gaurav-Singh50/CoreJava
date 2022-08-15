package com.enums;


enum Color{RED,GREEN,BLUE};



public class EnumDemo {
	
	public static void main(String[] args) 
	{
		
	System.out.println(Color.RED);
		
		for(Color c:Color.values())
		{
			System.out.println(c.ordinal());
			System.out.println(c);
		}
		
	}
}
