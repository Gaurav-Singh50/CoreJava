package com.collections;
import java.util.*;
public class CourseDetails 
{
	
	ArrayList<OnlineCourse>courselist=new ArrayList<OnlineCourse>();
	
	OnlineCourse oc;
	
	
void addDetails()
{
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=3;i++)
	{  
		oc=new OnlineCourse();
		System.out.println("Enter the name of course");
		String name=sc.nextLine();
		oc.setName(name);
		System.out.println("Enter the fees");
		int fees=sc.nextInt();
		oc.setFees(fees);
		System.out.println("Enter the duration");
		int duration=sc.nextInt();
		oc.setDuration(duration);
		courselist.add(oc);
		sc.nextLine();
	}
	sc.close();
	System.out.println(courselist);
}
void viewDetails()
{
	for( OnlineCourse c:courselist)
	{
		System.out.println("Details of courses");
		System.out.println("Name of course is "+c.getName());
		System.out.println("Fees is "+c.getFees());
		System.out.println("Duration is "+c.getDuration());
	}
}
void updateDetails(String coursename)
{//int index=0;
	for( OnlineCourse oc:courselist)
	{
		if(oc.getName().equalsIgnoreCase("Android"))
		{
			oc.setName(coursename);
			String updtname=oc.getName();
//			OnlineCourse course=new OnlineCourse();
//				course.setDuration(6);
//				course.setName(coursename);
//				course.setFees(80000);
//			courselist.set(index, course);)
		System.out.println("updated course name is "+updtname);
		}
		//index++;
	}
}


//void delete(String coursename)
//{	int index=0;
//	for( OnlineCourse oc:courselist)
//	{
//		if(oc.getName().equalsIgnoreCase(coursename))
//		{
//			
//			courselist.remove(index);
//		}
//		index++;
//	}
//	System.out.println(courselist.size());
//}



void delete1(String coursename)
{	
	for( int i=0;i<courselist.size();i++)
	{
		OnlineCourse oc=courselist.get(i);
		if(oc.getName().equals(coursename))
		{
			courselist.remove(i);
		}
	}
	System.out.println("In delete1"+courselist.size());
}


public static void main(String[] args)
{
	CourseDetails obj1=new CourseDetails();
	obj1.addDetails();
	obj1.viewDetails();
	//obj1.updateDetails("Core Java");
	//obj1.delete("java");
	obj1.delete1("android");
	obj1.viewDetails();
}
}
