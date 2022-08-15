package com.io;
import java.util.*;

public class ScannerDemo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter salary");
	
		float sal=sc.nextFloat();
		
			sc.nextLine();
		System.out.println("Enter Name");
				
		String name=sc.nextLine();
		
		System.out.println("Enter Phone");
		long phone=sc.nextLong();
		
		System.out.println("age is "+age+"salary is"+sal+"name is "+name+"phonenumber is "+phone);
	
		sc.close();
		
	}
}
