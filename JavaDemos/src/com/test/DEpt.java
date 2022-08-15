package com.test;

public class DEpt {

	
	
	public static void main(String[] args) {
		
		String name="abc";
		String name1=String.format("%10s",name);
		System.out.printf("%s",name1);
		
		int age=20;
		float sal=4599.99f;
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		
		System.out.printf("value is%s %20d\n",name,age);
		
		System.out.format("value of age is %d and salary is %f", age,sal);
	}
	
	
}
