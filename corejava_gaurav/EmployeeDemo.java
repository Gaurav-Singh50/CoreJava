class Employee
{
String name,designation;
int salary;


Employee()
{
}

Employee(String name,String designation,int salary)
{

this.name=name;
this.designation=designation;
this.salary=salary;
}



void getInfo()
{
System.out.println("Name of the employee is "+name);
System.out.println("Designation of the employee is "+designation);
System.out.println("Salary of the employee is "+salary);
}
void grossSalary()
{
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


//System.out.println("Bonus="+bonus);
void getInfo()
{
super.getInfo();
System.out.println("Bonus="+bonus);

}
void grossSalary()
{
bonus=bonus+salary;

System.out.println("Total salary= "+bonus);

}



}





class AdhocEmployee extends Employee
{
int incentive;
AdhocEmployee(String name,String designation,int salary,int incentive)
{
super(name,designation,salary);
this.incentive=incentive;
}

//System.out.println("Incentive= "+incentive);

void getInfo()
{

System.out.println("Incentive= "+incentive);
}
void grossSalary()
{

incentive=incentive+salary;
System.out.println("Total salary= "+incentive);
System.out.println("---------------------------");

}




}


class EmployeeDemo
{
public static void main(String[]args)
{
PermanentEmployee p=new PermanentEmployee("john","Developer",80000,800);
p.getInfo();
p.grossSalary();


AdhocEmployee a=new AdhocEmployee("Smith","Tester",40000,400);
a.getInfo();
a.grossSalary();

}

}








 