package com.test;
import com.beans.Employee;
public class Employee_Bean_Salary 
{

	public void messaging(Employee emp)
	{
		String degree=emp.getQualification();
		if(degree.equalsIgnoreCase("doctor"))
		{
			System.out.println("Hello Doctor");
		}
	
	}
	
	
	
	public static void main(String[] args)
	{
		
		Employee em=new Employee();
		
		em.setName("Scott");
		em.setEmail(null);
		em.setQualification("Doctor");
		
		Employee em1=new Employee();
		
		em1.setName("Scott");
		em1.setEmail(null);
		em1.setQualification("Teacher");

			Employee_Bean_Salary eb1=new Employee_Bean_Salary();
				eb1.messaging(em1);
	}
	
	
	
	
	
	
}
