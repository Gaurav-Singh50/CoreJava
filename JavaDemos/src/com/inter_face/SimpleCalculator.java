package com.inter_face;

public class SimpleCalculator implements Calculation
{
	private String name;
	private float price;
	
	public SimpleCalculator(String name,float price) 
	{
		this.name=name;
		this.price=price;
	}
	@Override
	public void add(int x, int y) {
		int sum=x+y;
		System.out.println(sum);
	}

	@Override
	public int sub(int x, int y) {
		
		return  (x-y);
	}
	public void getDetails()
	{
		
		System.out.println("name is "+name);
		System.out.println("price is "+price);
	}


}
