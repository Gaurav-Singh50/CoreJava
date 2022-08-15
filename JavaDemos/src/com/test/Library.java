package com.test;
import java.util.*;
public class Library {
	
	public static void main(String[] args) {
		System.out.println("Enter number of days");
		Scanner sc=new Scanner(System.in);
		int no_of_days=sc.nextInt();
		int fine=0;
		
		
		if(no_of_days>=1 && no_of_days<=10)
		{
			
			fine=no_of_days*1;
			System.out.println("fine to be paid "+fine);
			
			
		}
		
		
		
	if(no_of_days>10 &&no_of_days<=20)
	{
		
		int extraday=no_of_days-10;
		fine=extraday*5+10*1;
		System.out.println("fine to be paid for"+no_of_days+"is "+fine);
		
		
		
	}
	
	
	if(no_of_days>20)
	{
		
		int extday=no_of_days-20;
		fine=extday*10+10*1+10*5;
				
		
		System.out.println("fine to be paid for"+no_of_days+"is "+fine);
		
	}
	
		
	}

}
