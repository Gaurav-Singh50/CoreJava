abstract class Teacher
{
abstract void teach();

}

class MathTeacher extends Teacher
{
void geometryFormulas()
{
System.out.println("all Formulas");
}
void teach()
{
System.out.println("teaches math");
}
}

class ComputerTeacher extends Teacher
{
void teach()
{
System.out.println("teaches computer");
}
}


class RunTimeDemo
{
public static void main(String[]args)
{
Teacher teacher=null;        //reference variable of Abstract class teacher.

MathTeacher mt=new MathTeacher();
ComputerTeacher ct=new ComputerTeacher();
teacher=mt;                   //super class reference variable can refer object of sub class.(RUN TIME POLYMORPHISM)
teacher.teach();

/*teacher.geometryFormulas();
we cannot access sub class explicit method with super class ref variable because it will give compile time error bcoz teacher.geometryFormulas() will search 
geometryFormulas() method in Teacher class.*/

//at compile time teacher.teach() will search teach() method in teacher class but at,run time it will search teach() method in MathTeacher class. 

teacher=ct;
teacher.teach();

/*Teacher t=null;
t=new MathTeacher();
t.teach();
t.geometryFormula();  //cannot do this as compile time error and also we don't have reference variable of MathTeacher class.
t=new ComputerTeacher();
t.teach();


Teacher t1=new MathTeacher();     way of principal of run time poymorphism and we can only access super class method which are inherited by sub class and 
                                  cannot access sub class explicit methods.
*/

}
}
