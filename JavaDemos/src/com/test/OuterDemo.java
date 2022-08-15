package com.test;

public class OuterDemo {
	
	public static void main(String[] args) {
		
		Outer o=new Outer();
		Outer.Inner obj=o.new Inner();
		Outer.Inner.show();
		System.out.println();
		Test ot=new Test();
			ot.show();
			
	}
	


}

class Outer
{
	
String name="scott";

	private static int ag=30;
		


static class Test
{
	void show()
	{
		
		System.out.println("In static"+ag);
	}


}

class Inner
{
	static String address="Lko";
	
	void display()
	{
		
		System.out.println(address);
	}
	static void show()
	{
			
		
		System.out.println(address);
	}

}

}