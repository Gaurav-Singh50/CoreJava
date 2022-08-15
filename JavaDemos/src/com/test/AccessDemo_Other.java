package com.test;

public class AccessDemo_Other {

	
	public static void main(String[] args) {
		AccessDemo a=new AccessDemo();
			
		
		System.out.println("default"+a.def);
		//System.out.println("private"+a.pri);//data hiding
		System.out.println("public"+a.pub);
		System.out.println("protected"+a.pro);
	}
}

