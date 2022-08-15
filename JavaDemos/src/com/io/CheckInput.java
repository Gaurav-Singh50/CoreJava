package com.io;
import java.util.*;
public class CheckInput {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		/*
		 *  System.out.println("Enter age");
		 * if(sc.hasNextInt()) {
		 * 
		 * int num= sc.nextInt(); System.out.println(num); } else {
		 * 
		 * System.out.println("enter digit only"); }
		 */
		
		
		System.out.println("Enter student's name: ");
		String name = sc.nextLine();
		while(!name.matches("[a-zA-Z]+")){
		    System.out.println("Please enter a valid name!");
		    name = sc.nextLine();
		}
		System.out.println(name);
		
	}

}
