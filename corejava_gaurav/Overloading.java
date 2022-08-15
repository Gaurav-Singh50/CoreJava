class Overloading
{



void add(int x,int y)
{
int sum=x+y;
System.out.println("Sum of two number"  +sum);

}



void add(int x,float y)
{
float sum=x+y;
System.out.println("Sum of int and float number"  +sum);

}

void add(float a,int b)
{
float sum=a+b;
System.out.println("Sum of int and float number"  +sum);

}










void add(int x,float y,int z)
{
float sum=x+y+z;
System.out.println("Sum of three number "+sum);
}




void add(float x,float y)
{
float sum=x+y;
System.out.println("Sum of two float number"  +sum);
}



public static void main(String[]args)
{
Overloading obj=new Overloading();
System.out.println(obj);          //hashcode of obj object
obj.add(3,4);
obj.add(3,6.5f,5);
obj.add(56.5f,78.6f);


Overloading obj1=new Overloading();
System.out.println(obj1);      // hashcode may be different in any obj 

}
}