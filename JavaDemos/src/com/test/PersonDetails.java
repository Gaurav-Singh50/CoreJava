package com.test;

public class PersonDetails {
	public void showDetails(String name,long ...phone)
	{
		System.out.print(name+" phonenumber is ");
		for(long ph:phone)
		{
			System.out.print(ph+"\t");
			
		}
	
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		PersonDetails pd=new PersonDetails();
		pd.showDetails("scott", 56667788,7878998);
		pd.showDetails("smith",6787979,67889909,788899);
	}

}
