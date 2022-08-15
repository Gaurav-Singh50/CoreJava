package com.innerclasses;

public class Drawing_Static {

	private static  String Subject="Art and Craft"; 
	
	void show()
	{
		System.out.println("in drawing static class");
	}
	
	static class  Rectangle
	{
		static String color="RED";
		int width,height;
		static void showColor()
		{
			System.out.println("Color name is "+color);
			System.out.println("Color name is "+Subject);
		
		
		}
		void setDim(int width,int height)
		{
			
			this.width=width;
			this.height=height;
		}
		
		void area()
		{
			System.out.println("area is "+(width*height));
		}
		
	}
	
	
	
}
