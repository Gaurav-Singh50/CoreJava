package com.lambda;

public class Lambda_Thread {
	
public static void main(String[] args) 
{

Runnable r=()->
			{
				try {
					for(int i=1;i<=4;i++)
					{System.out.println(i);
					Thread.sleep(2000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			};
	
			Thread ttt=new Thread(r);
			ttt.start();
			
	Thread t1=new Thread(()->{
		
						try {
								for(int i=1;i<=4;i++)
								{System.out.println(i);
								Thread.sleep(2000);
								}
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
			
				);
	
				t1.start();
}
}
