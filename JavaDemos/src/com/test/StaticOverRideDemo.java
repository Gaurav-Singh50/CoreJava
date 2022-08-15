package com.test;

public class StaticOverRideDemo {
	
public static void main(String[] args) {
	
	Book bk=null;
	MathBook mb=new MathBook();
	
	bk=mb;
	bk.contents();
	bk.show();//we cannot override static method
	MathBook.show();
	mb.show();
	Book.show();
	
}
}
