package com.innerclasses;

import com.innerclasses.Drawing_Static.Rectangle;

public class StaticClassDemo {
	public static void main(String[] args)
	{
		
		Drawing_Static.Rectangle.showColor();
		System.out.println(Drawing_Static.Rectangle.color);
		
		Rectangle r=new Rectangle();
		r.setDim(2, 3);
		r.area();
	}

}
