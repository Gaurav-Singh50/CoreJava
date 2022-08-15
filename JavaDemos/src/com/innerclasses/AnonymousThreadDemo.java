package com.innerclasses;

public class AnonymousThreadDemo
{
	public static void main(String[] args)
	{
		//interface ref variable can ref the obj of implemeted class
		Thread t=new Thread(
							
				new Runnable()//class object that implements Runnable interface
				{
					
					public void run()
					{
						Thread t1=Thread.currentThread();
						System.out.println("Thread  name is "+t1.getName());
						
						for(int i=1;i<=5;i++)
						{
							System.out.println(i);
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
					}
					
					
					
				}//anonymous class body close
				
								
				);//Thread class constructor close
		t.setName("Anonymous thread");
		t.start();
		
	}

}
