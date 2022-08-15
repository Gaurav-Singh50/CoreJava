class Employee
{

String name,designation;//instance variable

final static String COMPANY_NAME="Precursor";//static variable using final can't modify the value but can be acsess.

Employee(String name, String designation)
{

this.name = name;
this.designation = designation;

}
Employee()//Default Empty Constructor
{
}

void getDetails()
{

System.out.println("Employee Name is "+name+" and Designation is "+designation);

System.out.println("Company is "+COMPANY_NAME);//Instance method can access static variable
}

static void company_Details()
{

System.out.println("Company is "+COMPANY_NAME);

}


}

class StaticDemo
{

public static void main(String[]args)
{

System.out.println("Company Name is "+Employee.COMPANY_NAME);//accessing static variable value with class name

Employee e1 = new Employee("Scott","TeamLeader");
e1.getDetails();

//e1.COMPANY_NAME = "XYZ";
//Static variable can be changed by object if not FINAL keyword use and can be modify by any number of object created.

//Static variable value same for all the object.

Employee.company_Details();

}

}
