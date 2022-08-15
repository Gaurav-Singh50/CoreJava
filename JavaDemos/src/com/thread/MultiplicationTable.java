package com.thread;

public class MultiplicationTable 
{
	
	
synchronized	void printTable(int num)
	{
	Thread t=Thread.currentThread();
	for(int i=1;i<=10;i++)
	{
		
		System.out.println(num+"*"+i+"="+(num*i)+t.getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}
}
