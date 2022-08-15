package com.test;

public class PrimeNumber {
	public static void main(String[] args) 
	{
		
		int number=Integer.parseInt(args[0]);
		int count=0;
		int flag=0;
		if(number==1 ||number==0)
		{
			System.out.println("not prime");
		}
		else
		{
			
			
			for(int i=2;i<=number/2;i++)
			{
				
				
				if(number%i==0)
				{
					flag=1;
					break;
				}
			}
			
			if(flag==0)
			System.out.println(number+"is prime");
			else
				System.out.println(number+ "is not prime");
		}
//		for (int i=0;i<=number;i++)
//		{
//			
//			if(number%i==0)
//			{
//				
//				count++;
//			}
//		}
//		
//		if(count==2)
//		{
//			System.out.println(number+"is prime number");
//		}
//		else
//		{
//			System.out.println(number+" is not prime number");
//		}
//		
	}

}
