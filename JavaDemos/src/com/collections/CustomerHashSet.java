package com.collections;

import java.util.*;
import com.beans.*;
public class CustomerHashSet {
	public static void main(String[] args) {
		
		HashSet<Customer>customerset=new HashSet();
			Customer c1=new Customer("scott",101);
			Customer c2=new Customer("scott",101);
			
			customerset.add(c1);
			customerset.add(c2);
			customerset.add(new Customer("John",304));
			System.out.println(customerset);
			
			
			Iterator<Customer>it=customerset.iterator();
			
				while(it.hasNext())
				{
					
					Customer c=it.next();
					System.out.println("Customer name is "+c.getName());
					System.out.println("Customer id is "+c.getId());
				}
				
				for(Customer c:customerset)
				{
					
					System.out.println(c.getName());
					
					System.out.println(c.getId());
					
				}
				
		
	}

}
