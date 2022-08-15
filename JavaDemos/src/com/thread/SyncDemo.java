package com.thread;

public class SyncDemo {
	public static void main(String[] args) 
	{
	MultiplicationTable mt=new MultiplicationTable();
	new Calculator("Casio", mt,3,"CalciThread");
	new Laptop("DELL", mt, 5, "Laptopthread");
		
	}

}
