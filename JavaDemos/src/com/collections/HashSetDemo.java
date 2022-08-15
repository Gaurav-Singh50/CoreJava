package com.collections;
import java.util.*;

public class HashSetDemo {
	public static void main(String[] args)
	{
		HashSet<Integer>numberset=new HashSet<Integer>();

		numberset.add(56);//autoboxing compile time jdk1.5 implicit boxing
		//numberset.add(new Integer(10));
		numberset.add(770);
		numberset.add(770);
		numberset.add(1000);
		numberset.add(8888);
		numberset.add(344545);
		numberset.add(666);
		numberset.add(12223);
		numberset.add(778);
		numberset.add(8998);
		numberset.add(new Integer(7677));
		System.out.println(numberset);
		
		Iterator<Integer>it=numberset.iterator();
		
		while(it.hasNext())
		{
			//Integer obj=it.next();
				//int x=obj.intValue();//explicit unboxing
				
				
				int num=it.next();//implicit unboxing auto unboxing
				System.out.println(num);
				
				
				
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
