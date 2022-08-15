package com.thread;

public class EvenOdd implements Runnable
{
	Thread t;
	
	
	public EvenOdd(String name)
	{
		
		t=new Thread(this,name);//explicit thread creation
		t.start();//runnable state
		
	}
	
	public void run()
	{
		String name=t.getName();
		for(int i=1;i<=10;i++)
		{
			if(name.equalsIgnoreCase("Even") &&(i%2==0))
			{
			System.out.println(i+name);
			try {
				Thread.sleep(1000);
			//	t.interrupt();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
			
			if(name.equalsIgnoreCase("odd") &&(i%2!=0))
			{
			System.out.println(i+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
			
		}
		
				
		
		
	}
	
	
}
