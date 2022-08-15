abstract class Teacher
{

abstract void teach();//10 methods

}

class MathTeacher extends Teacher
{

void geometryFormulas()
{
System.out.println("all Formulas"); 
}
void teach()
{

	System.out.println("teaches Maths");
}

}



class ComputerTeacher extends Teacher
{

void teach()
{

	System.out.println("teaches computer");
}

}

class  RunTimeDemo
{
public static void main(String[]args)
{

	Teacher teacher=null;//reference variable of Abstract class Teacher
	MathTeacher mt=new MathTeacher();
	ComputerTeacher ct=new ComputerTeacher();
	teacher=mt;//runtime polymorphism-> a super class ref var can refer obj of sub class
	teacher.teach();
	//teacher.geometryFormulas();//cannot access sub class explicit method with super class ref variable

	teacher=ct;
	teacher.teach();

	//Teacher t=null;
	//t=new MathTeacher();
	//t.teach();
		
	//t=new ComputerTeacher();
	//t.teach();

	/*Teacher t1=new MathTeacher();
	int x=0;
	x=10;
	int x=10;*/
}

}




