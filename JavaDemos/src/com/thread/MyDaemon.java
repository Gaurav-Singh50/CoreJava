package com.thread;

public class MyDaemon  extends Thread
{

	public MyDaemon(String name)
	
	{
		setName(name);
		setDaemon(true);//it will create a daemon thread
		start();//before starting the thread we must create it as daemon
		
	}
	
	public void run() {
		
		for(int i=1;i<=20;i++)
		{
			
			System.out.println(i+getName());
			try {
				sleep(2000);
			} catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
