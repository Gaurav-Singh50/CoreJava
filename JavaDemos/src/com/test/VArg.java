package com.test;

public class VArg {
	static int sum(int ...num)//internally treated as array
	{
		int add=0;
		
		/*
		 * for(int i=0;i<num.length;i++) { add=add+num[i];
		 * 
		 * 
		 * }
		 */
		
		//enhanced for loop jdk1.5 for each loop
		
		for (int x:num)//no  increment,no condition check
		{
			
			System.out.println(x);
			add=add+x;
			
		}
			
			
			
			
		return add;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(sum(3,4));//method call
		System.out.println(sum(6,7,8,9));
	}

}
