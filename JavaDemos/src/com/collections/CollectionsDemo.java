package com.collections;
import java.util.*;
public class CollectionsDemo 
{

	public static void main(String[] args)
	{
		
	ArrayList<String>courselist=new ArrayList();
		courselist.add("python");
		courselist.add("angular");
		courselist.add("android");
		courselist.add("nodejs");
		courselist.add("django");
		courselist.add("spring");
	
		Collections.sort(courselist);
		System.out.println(courselist);
		
		for (String name:courselist)
			System.out.println(name);
	
		
		Collections.reverse(courselist);
		System.out.println("REVERSE ORDER");
		for (String name:courselist)
			System.out.println(name);
	
	
	}
	
}


