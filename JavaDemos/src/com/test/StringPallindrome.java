package com.test;

import java.util.Arrays;

public class StringPallindrome {
	public static void main(String[] args) {
		
		String text=args[0];
		
	
		StringBuilder sb=new StringBuilder();
		
		for(int i=text.length()-1;i>=0;i--)
		{
			
			sb.append(text.charAt(i));
			
		}
		
		String txt1=sb.toString();
		System.out.println(txt1);
		System.out.println(text);
		if(txt1.equals(text))
		{
			System.out.println(text+" is a pallindrome");
		}
		else
		{
			
			System.out.println(text+"is not a pallindrome");
		}
		
	
		String reverse_string="";
		for(int i=text.length()-1;i>=0;i--)
		{
			
			reverse_string=reverse_string+text.charAt(i);
			
		}
		
		if(reverse_string.equals(text))
		{
			
			System.out.println(text+" is a pallindrome");
			
		}
		
		else
		{
			
			System.out.println(text+"is not a pallindrome");
		}
	}

}
