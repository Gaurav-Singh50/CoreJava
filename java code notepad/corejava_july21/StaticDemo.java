class Employee
{
 String name,designation,cname;//instance varible
 static final String COMPANY_NAME="Precursor";
static final String COMPANY_EMAIL="precursorlko@gmail.com";

Employee(String name,String designation)
{

this.name=name;
this.designation=designation;
}
Employee()
{

}
void getDetails()//nonstatic method or instance method
{

	System.out.println("Employee name is "+name+"and designation is "+designation);
	System.out.println("company is "+COMPANY_NAME);

}


static void company_Details()
{
System.out.println("name of company is "+COMPANY_NAME);
System.out.println("Email is "+COMPANY_EMAIL);
}

}

class StaticDemo
{
public static void main(String[]args)//instance 
{



System.out.println("company name is "+Employee.COMPANY_NAME);//accessing static variable value with class name
Employee emp=new Employee("Scott","TeamLeader");
	emp.getDetails();
Employee emp1=new Employee("MIKE","Project Manager");
	emp1.getDetails();
	Employee.company_Details();



	
}

}


