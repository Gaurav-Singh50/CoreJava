package com.test;

public class MyEmployee {
	String name,designation;
	float salary;
	
	void setDetails(String name,String designation,float salary)
	{
		
		this.name=name;
		this.designation=designation;
		
		this.salary=salary;
	}
	
	
	void getDetails()
	{
		
		System.out.println("Name of Employee is "+name);
		System.out.println("Designation of Employee is "+designation);
		System.out.println("Salary of Employee is "+salary);


	}

}

class EmployeeDemo
{
	
public static void main(String[] args)
{
	Employee emp=new Employee();
			emp.setDetails("Jhon","TeamLeader",60000.00f);
				emp.getDetails();
				
				Employee emp1=new Employee();
				emp1.setDetails("MIke","Project Manager",50000.00f);
					emp1.getDetails();
							
				
}

}