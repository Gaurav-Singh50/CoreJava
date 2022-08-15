package com.inter_face;

public class ScientificeCalculator  implements Calculation
{
	private String name,color;
	private float price;
	public ScientificeCalculator(String name,String color,float price)
	{
		
		this.color=color;
		this.price=price;
		this.name=name;
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

	public void area(float radius)
	{
		
		float area=		PI*radius*radius;
		System.out.println("area of circle is"+area);
		
	}
	
	public void getDetails()
	{
		
		System.out.println("name is "+name);
		System.out.println("price is "+price);
		System.out.println("color is "+color);
		
	}
}
