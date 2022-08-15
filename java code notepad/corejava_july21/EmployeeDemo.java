class Employee
{
	String name,designation;
	int salary;
	Employee(String name,String designation,int salary)
	{
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	void getInfo()
	{
		System.out.println("Name of the employee is "+name);
		System.out.println("Designation of the employee is "+designation+"and Salary of the employee is "+salary);
	}
	void grossSalary()
	{}
	
	
}

class AdhocEmployee extends Employee
{
	int incentive;
	AdhocEmployee(String name,String designation,int salary,int incentive)
	{
		super(name,designation,salary);
		this.incentive=incentive;
	}
	void getInfo()
	{
		super.getInfo();
		System.out.println(" and Employee Incentive is "+incentive);
	}
	void grossSalary()//override
	{
		int gross=salary+incentive;
		System.out.println("Total Salary of Adhoc employee is"+gross);
	}
	
}

class PermanentEmployee extends Employee
{
	int bonus;
	PermanentEmployee(String name,String designation,int salary,int bonus)
	{
		super(name,designation,salary);
		this.bonus=bonus;
	}
	void getInfo()
	{
		super.getInfo();
		System.out.println(" and Employee bonus is "+bonus);
	}
	void grossSalary()
	{
		int gross=salary+bonus;
		System.out.println("Total Salary of Permanent emp is "+gross);
	}
	
}

class EmployeeDemo
{
	public static void main(String[]args)
	{
	
	

	}
}


