package com.collections;

public class OnlineCourse
{
String name;
int fees,duration;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
