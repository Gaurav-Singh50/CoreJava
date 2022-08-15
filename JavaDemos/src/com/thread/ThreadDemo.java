package com.thread;

public class ThreadDemo {
	
	public static void main(String[] args) 
	{
		Thread t=Thread.currentThread();
		
		String name=t.getName();
		System.out.println("name of thread is "+name);
		int priority=t.getPriority();
		System.out.println("priority is"+priority);

		for (int i=1;i<=7;i++)
		{
			System.out.println(i);
			try {
			Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				
				System.out.println(ie);
			}
			
		}
		
		
	}
	

}
