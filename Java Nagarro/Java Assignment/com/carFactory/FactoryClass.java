package com.carFactory;

import com.carType.CarType;
import com.threeTypes.Hatchback;
import com.threeTypes.Sedan;
import com.threeTypes.Suv;

import Exceptions.WrongCarType;

public class FactoryClass {
	
	 public CarType car(String cartype)
	    {
		 	//Checking Car Type i.e,Hatchback,SUV,Sedan.
	        if (cartype.equalsIgnoreCase("Hatchback")) {
	            return new Hatchback();
	        }
	        else if (cartype.equalsIgnoreCase("Sedan")) {
	            return new Sedan();
	        }
	        else if (cartype.equalsIgnoreCase("SUV")) {
	            return new Suv();
	        }
	        //Cartype other than SUV,Hatchback,Sedan
	        else if(!(cartype.equalsIgnoreCase("Hatchback")|| cartype.equalsIgnoreCase("Sedan") ||cartype.equalsIgnoreCase("SUV")))
	        {
	        	throw new WrongCarType("please enter a valid car type");
	        }
	        //If Cartype is null or empty the return null.
	        return null;
	    }

}

