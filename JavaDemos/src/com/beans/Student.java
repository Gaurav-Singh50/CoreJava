package com.beans;

import java.util.Objects;

public class Student {
	@Override
	public int hashCode() {
		
		System.out.println(Objects.hash(name,rollnumber));
		return Objects.hash(name, rollnumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollnumber == other.rollnumber;
	}
	private String name;
	private int rollnumber;
	
	public Student() {
		
	}
	
	
	public Student(String name, int rollnumber) 
	{
	
		this.name = name;
		this.rollnumber = rollnumber;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	
	
	

}
