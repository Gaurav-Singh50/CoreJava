package com.test;
import com.beans.*;
import java.util.*;
public class StudentArrayDemo
{

	public static void main(String[] args) 
	{
		Student obj=null;
		
		//array of Student class
		System.out.println("Enter size of the array");
		Scanner sc=new Scanner(System.in);
		
			int size=sc.nextInt();
		Student[]studentarray=new Student[size];
		
		for(int i=0;i<size;i++)
		{
			sc.nextLine();
			System.out.println("Enter name");
			String name=sc.nextLine();
			System.out.println("Enter rollnumber");
			int roll=sc.nextInt();
			obj=new Student(name, roll);//parameterised constructor
			studentarray[i]=obj;
			
			//studentarray[i]=new Student(name, roll);
				
		}
//		Student s=new Student("scott", 101);
//		studentarray[0]=s;
//		Student s1=new Student("smith", 102);
//		studentarray[1]=s1;
		
		
		for(int i=0;i<studentarray.length;i++)
		{
			Student s=studentarray[i];
			//System.out.print(s);
			
			System.out.println("Student name is "+s.getName());
			System.out.println("Student rollnumber is "+s.getRollnumber());
			
			
			
		}
		
		
	}
}
