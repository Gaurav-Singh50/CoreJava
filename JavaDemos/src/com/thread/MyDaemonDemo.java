package com.thread;

public class MyDaemonDemo {

	public static void main(String[] args)
	{
		Thread t=Thread.currentThread();
	System.out.println(t.isDaemon());
	
	MyDaemon m=new MyDaemon("daemon");
	System.out.println(m.isDaemon());
	System.out.println("Hello main thread");
	for(int i=1;i<=10;i++)
	{
	System.out.println(i+t.getName());
	try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
