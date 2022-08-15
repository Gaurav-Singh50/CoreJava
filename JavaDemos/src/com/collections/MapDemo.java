package com.collections;
import java.util.*;
import java.util.Map.Entry;
public class MapDemo
{
	
	

	public static void main(String[] args) 
	{
		//TreeMap<Integer,String>collegemap=new TreeMap();

		var name="scott";
		var age=20;
		int []arr= {3,4,5};
		for(var i:arr)
		{
			System.out.println(i);
		}
					
			HashMap<Integer,String>collegemap=new HashMap();
	
				collegemap.put(101, "SRMCEM");//auto boxing
				collegemap.put(102, "BBDU");
				collegemap.put(104, "AMITY");
				collegemap.put(103, "SRMU");
				collegemap.put(103, "SMS");
				collegemap.put(500, "SMS");
				collegemap.put(600, "SMS");
				collegemap.put(987, "SMS");
				collegemap.put(999, "SMS");
				
				System.out.println(collegemap);
				
				
				Set<Integer>keycollection=collegemap.keySet();
				
			Iterator<Integer>it=keycollection.iterator();
			
			while(it.hasNext())
			{
				
				int collegecode_key=it.next();//key auto unboxing
				
				
				String collegename=	collegemap.get(collegecode_key);
				
				System.out.println("college code is "+collegecode_key+"\t"+"collegename is "+collegename);
				
				
				
			}
				
			for(Entry<Integer, String> m:collegemap.entrySet())	
			{
				
							System.out.println(m.getKey()+"\t"+m.getValue());
							
			}
			
			
			
	
					
	
		
		
	}
	
	
	
	
}
