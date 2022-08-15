package com.designpattern;

class Hod
{
	private static Hod hod;
	
	private Hod()
	{
		
		
	}
	
	
	public static Hod getInstance()
	{
		if(hod==null)
		{
			hod=new Hod();
			return hod;
		}
		else
			 return hod;
		
		
	}
	
	public void show()
	{
		System.out.println("this is  singleton design pattern based class");
	}

}


public class SingletonDemo
{
public static void main(String[] args) 

{
	Hod h=Hod.getInstance();
	//Hod h2=new Hod();
	
	Hod h1=Hod.getInstance();
			
	System.out.println(h==h1);
	h1.show();
	h.show();
	
}
}



