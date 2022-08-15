package com.beans;

public class PersonBean
{
private String name;
private int age;

@Override
	public String toString() {
		
		return "hello  "+name;
	}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public PersonBean(String name, int age) {
	
	this.name = name;
	this.age = age;
}
public PersonBean() {
	
	
}




}
