class Overloading
{
/* COMPILE TIME POLYMORPHISM */
//Method Overloading depends on no of paramter list and data type passed and sequence of paramter(data type) passed.

void add(int a,int b)
{

int sum = a+b;

System.out.println("Sum of 2 no : "+ sum);
}

void add(int a,float b)
{

float sum = a+b;

System.out.println("Sum of 2 no : "+ sum);
}

void add(float a,int b)
{

float sum = a+b;

System.out.println("Sum of 2 no : "+ sum);
}


void add(int a,int b,int c)
{

int sum = a+b+c;

System.out.println("Sum of 3 no : "+sum);
}

void add(float a,float b)
{

float sum = a+b;

System.out.println("Sum of 2 no : "+ sum);
}

public static void main(String[]args)
{

Overloading obj = new Overloading();//refernce to the class object(hash code is assign to obj of the class)

System.out.println(obj);//print the hash code of the object(hash code can be diff or can be same depends on the hashing algo)


obj.add(9,8);
obj.add(89,98,77);
obj.add(9.9f,8.9f);

}

}