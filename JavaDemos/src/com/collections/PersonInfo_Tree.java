package com.collections;
import java.util.*;
import com.beans.PersonBean;
public class PersonInfo_Tree {
	
	
	TreeSet<PersonBean>personset;
	NameComparator nc=new NameComparator();
	//AgeComparator ac=new AgeComparator();
	
	public PersonInfo_Tree()
	{
		
		personset=new TreeSet<PersonBean>(nc);
		//personset=new TreeSet<PersonBean>(ac);
	}
	
	
	void addData()
	{
		personset.add(new PersonBean("Scott",50));
		
		personset.add(new PersonBean("Smith",34));
		personset.add(new PersonBean("John",20));
		
	}
	void showData()
	{
		
		Iterator<PersonBean>it=personset.iterator();
		
			while(it.hasNext())
			{
				
				PersonBean pb=it.next();
				
				System.out.println(pb);//hashcode
				
					System.out.println("person name is "+pb.getName());
					System.out.println("person age is "+pb.getAge());
			}
		
		
	}
	
	
	public static void main(String[] args) {
		PersonInfo_Tree persontree=new PersonInfo_Tree();
		persontree.addData();
		persontree.showData();
		
		
		
	}
	
	

}
