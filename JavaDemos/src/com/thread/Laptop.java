package com.thread;

public class Laptop  implements Runnable
{
	String cname;
	MultiplicationTable table;
	int number;
	Thread t;
	public Laptop(String cname,MultiplicationTable table,int number,String name)
	{
		
		this.cname=cname;
		this.table=table;
		this.number=number;
		
		t=new Thread(this,name);
		t.start();
	}
	
	public void run()
	{
		System.out.println("Laptop Thread is doing task");
		table.printTable(number);
		
	}
	
}
