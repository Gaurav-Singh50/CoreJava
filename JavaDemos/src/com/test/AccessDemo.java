package com.test;

public class AccessDemo {

	int def=10;//default
	
	
	private int pri=30;
	public int pub=40;
	protected int pro=50;
	/*
	 * private AccessDemo() {
	 * 
	 * System.out.println("constructor"); } private void show()
	 * 
	 * { System.out.println("hello"); }
	 */
		
	public static void main(String[] args) 
	{
		AccessDemo a=new AccessDemo();
		
		System.out.println("default"+a.def);
		System.out.println("private"+a.pri);
		System.out.println("public"+a.pub);
		System.out.println("protected"+a.pro);
	}
	
	
	}
