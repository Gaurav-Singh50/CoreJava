package Exceptions;

public class WrongInsuranceType extends RuntimeException{
	
	public WrongInsuranceType(String msg)
	{
		super(msg);
	}

}