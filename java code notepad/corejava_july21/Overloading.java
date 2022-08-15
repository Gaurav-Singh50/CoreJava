class Overloading
{

void add(int x,int y)
{
int sum=x+y;
System.out.println("sum of two numbers"+sum);

}

void add(int x,float y)
{
float sum=x+y;
System.out.println("sum of int and float numbers"+sum);

}



void add(float a,int b)
{
float sum=a+b;
System.out.println("sum of int and float numbers"+sum);

}


/*int add(int y,int x)
{
int sum=x+y;
System.out.println("sum of two numbers"+sum);

}*/


void add(int x,int y,int z)
{
int sum=x+y+z;
System.out.println("sum of three numbers"+sum);

}

void add(float x,float y)
{
float sum=x+y;
System.out.println("sum of two floats"+sum);

}

public static void main(String[]args)
{

Overloading obj=new Overloading();
	System.out.println(obj);
	obj.add(3,4);
	obj.add(3.4f,5.6f);
	obj.add(4,5,6);

Overloading obj1=new Overloading();
	System.out.println(obj1);
Overloading obj2=new Overloading();
	System.out.println(obj2);


}


}

