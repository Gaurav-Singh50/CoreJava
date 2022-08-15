package com.threeTypes;

import com.carType.CarType;

import Exceptions.WrongInsuranceType;

public class Hatchback implements CarType{

	public int calPremium(String cartype, int price, String insuranceType,int model) {
			//calculating insurance premium
			int p=0,fp=0;
	 		p=(5*price)/100;
	 		//calculating final premium on the basis of insurance type
			if(insuranceType.equalsIgnoreCase("Premium"))
			{    int extrapart = (20*p)/100;
			    fp=extrapart+p;
			}
			else
			{
				fp=p;
			} 
			//Displaying result i.e,Car Model,Price,Total Insurance.
			System.out.println("Car Model is :"+model);
			System.out.println("Price :"+price);
			System.out.println("Total Insurance :"+fp);
			return fp;
		
		
	}

	

}
