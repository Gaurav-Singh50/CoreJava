package com.collections;

import java.util.*;
public class ArrayListDemo 
{

	public static void main(String[] args)
	{
		
		ArrayList<String> namelist=new ArrayList<String>();//TYpe safe ArrayList

			namelist.add("Scott");
			namelist.add("Smith");
			namelist.add("Mike");
			namelist.add("Joy");
			//namelist.add(23);
			for(int i=0;i<namelist.size();i++)
			{
				
				String name=namelist.get(i).toUpperCase();
				System.out.println("Hello "+name);
				
			}
		
			System.out.println(namelist);
			
			for(String nm:namelist)
			{
				
				System.out.println("Hello "+nm);
			}
			
		
		
		
	}
	
	
	
	
	
	
	
	
}
