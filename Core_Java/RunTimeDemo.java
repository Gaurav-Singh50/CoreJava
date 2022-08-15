abstract class Teacher
{

abstract void teach();

}

class MathTeacher extends Teacher
{

void teach()
{

System.out.println("Teaches Maths");

}

/*void getFormula()
{

System.out.println("Give the formula");

}*/
}
class ComputerTeacher extends Teacher
{

void teach()
{

System.out.println("Teaches Computer");

}

}

class RunTimeDemo
{

public static void main(String[]args)
{

Teacher teacher = null;//refernce variable of class teacher

MathTeacher mt = new MathTeacher();
ComputerTeacher ct = new ComputerTeacher();

teacher = mt;//Runtime Polymorphism->super class ref var can refer obj of sub class

teacher.teach();
//teacher.getFormula();//cannot access sub class explicit method with super class ref variable(hence give error at compile time)
//You can only access those method of sub class who have define in super class.

teacher = ct;
teacher.teach();


}

}