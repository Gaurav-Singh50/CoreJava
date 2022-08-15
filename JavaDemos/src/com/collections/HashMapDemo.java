package com.collections;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) 
	{
		
		
//		System.out.println("lko hashcode"+"lko".hashCode());
//		
//		System.out.println("knp hashcode"+"knp".hashCode());
//		
//		
//		System.out.println("vns hashcode"+"vns".hashCode());
//		
//		
//		System.out.println("jkp hashcode"+"jkp".hashCode());
		
		
		
	HashMap<String,String>citymap=new HashMap();
			citymap.put("lko", "Lucknow");
			citymap.put("knp", "Kanpur");
			
		citymap.put("vns", "Varanasi");
			citymap.put("jkp", "Jaipur");
		System.out.println(citymap);
		
	}
}
