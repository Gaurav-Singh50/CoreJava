package com.thread;

public class Calculator  implements Runnable
{
	String cname;
	MultiplicationTable table;
	int number;
	Thread t;
	public Calculator(String cname,MultiplicationTable table,int number,String name)
	{
		
		this.cname=cname;
		this.table=table;
		this.number=number;
		
		t=new Thread(this,name);
		t.start();
		//t.stop();
	}
	
	public void run()
	{
		System.out.println("Thread is doing task");
		table.printTable(number);
		
	}
	
}
