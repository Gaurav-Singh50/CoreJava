package com.enums;

public class Size_EnumDemo {

	public static void main(String[] args)
	{
		
		System.out.println(Size.SMALL.value);
		
		Size.MEDIUM.showSize();
		
		for(Size ss:Size.values())
			ss.showSize();
			
		
	}
}
