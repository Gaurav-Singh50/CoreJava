package com.thread;

public class CustomThread  extends Thread
{
public CustomThread(String name)
{
	
	setName(name);
	start();// put the thread in runnable state

}

//

	public void run()//never call it explictly it gets called implicitly
	{
		
		System.out.println("Thread name is "+getName());
		//System.out.println("THread priority is"+getPriority());
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			
			try {
				
				sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
}
