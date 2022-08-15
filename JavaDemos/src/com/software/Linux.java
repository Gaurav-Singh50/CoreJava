package com.software;

import com.os.SystemSoftware;

public class Linux  extends SystemSoftware
{


	public void show_features()
	{
		
		features();
		System.out.println(version);//error
		System.out.println(version);//will work
	}
}