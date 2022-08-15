package com.test;

public class Pallindrome {

	
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		
		int sum=0;
		int temp_number=number;
		while(number>0)
		{
			int rem=number%10;
			sum=sum*10+rem;
			number=number/10;
					
			
			
		}
		
		if(temp_number==sum)
		{
			
			System.out.println(temp_number+" is a pallindrome");
		}
		
		else
		{
			System.out.println(temp_number+"is not a pallindrome");
		}
	}
}
