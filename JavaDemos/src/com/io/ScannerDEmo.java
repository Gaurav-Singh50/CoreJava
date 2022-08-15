package com.io;
import java.util.Scanner;
public class ScannerDEmo {
 
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter RollNumber");
//		int roll=sc.nextInt();
//		System.out.println(roll);
//		System.out.println("Enter name");
//		String name=sc.nextLine();
//		System.out.println(name);
//		System.out.println("Enter Salary");
//		float sal=sc.nextFloat();//scans the next token of input as float
//		System.out.println(sal);
//		
//		sc.close();
		
		
		 Scanner keyboard = new Scanner(System.in);
	        System.out.println("Next enter two words:");

	        int n; 
	        String s1, s2; 

	        n = keyboard.nextInt(); 
	        s1 = keyboard.next(); 
	        keyboard.nextLine();
	        s2 =  keyboard.nextLine(); 
	        System.out.println(" n is " + n + " s1 is " + s1 + " s2 is " + s2);
		
	        keyboard.close();
	}
}
