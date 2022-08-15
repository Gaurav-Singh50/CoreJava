package com.test;
import  java.util.Date;
import java.util.Calendar;
public class BuiltInDemo 
{
public static void main(String[] args) 
{
//	Date d=new Date();
	
	/*
	 * System.out.println(d);
	 * 
	 * int mon=d.getMonth(); System.out.println(mon); int year=d.getYear();
	 * System.out.println(year);
	 * 
	 */
	
		Calendar c=Calendar.getInstance();//Factory Method
			int month=	c.get(Calendar.MONTH);
			System.out.println("Month is"+month);
			int day=c.get(Calendar.DATE);
			System.out.println("day is"+day);
			System.out.println("Year is  "+c.get(Calendar.YEAR));
		
}



}
