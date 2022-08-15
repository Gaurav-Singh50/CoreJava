package com.exception;

public class NameNotFoundException  extends Exception

{
	
	  public String getMessage()//Throwable class method override 
	  {
	  
	  return "Name does not found";
	  
	  }
	 
	
	@Override
	public String toString() //override toString() of Super class Object
	{
		
		return "Name does not match";
	}
}
