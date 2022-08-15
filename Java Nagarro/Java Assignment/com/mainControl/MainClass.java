package com.mainControl;

import java.util.Scanner;

import com.carFactory.FactoryClass;
import com.carType.CarType;

import Exceptions.WrongCarType;
import Exceptions.WrongInsuranceType;

public class MainClass {
	 public static void main(String[] args)
	    {
			 	Scanner sc=new Scanner(System.in);//Using Scanncer class for taking input from user
			 	boolean end=false;//taking boolean variable end to continue to take input from user until the answer is no.
			 	
			 	do {
			 		try {
			 	System.out.println("enter details");
				
				System.out.print("-model :");
				int model=sc.nextInt();
				
				System.out.print("-price :");
				int price=sc.nextInt();
				
				System.out.print("-cartype:");
				String cartype=sc.next();
				
				System.out.print("-insurancetype :");
				String insurancetype=sc.next();
				if(!(insurancetype.equalsIgnoreCase("Premium") || insurancetype.equalsIgnoreCase("Basic")))//if insurance type is other than basic or premium throw a exception.
				{
					throw new WrongInsuranceType("please enter a valid insurance type");
				}
		        FactoryClass Fact = new FactoryClass();
		        CarType c = Fact.car(cartype);
		        c.calPremium(cartype,price,insurancetype,model);
			 		}
		 		catch(WrongCarType | WrongInsuranceType e) 
				{
					System.out.println(e);
				}
		 		finally {
			 			System.out.println("__________________________");
			 			
			 			System.out.println("Do you want to enter details of any other car(y/n)");//Asking from user wheather he/she wants to enter the details again.
			 			String choose=sc.next();
			 			if(choose.equalsIgnoreCase("y"))
			 				end=false;
			 			else if(choose.equalsIgnoreCase("n"))
			 				end=true;
		 			
			 		}
			 	}while(end!=true);
	    }

}
