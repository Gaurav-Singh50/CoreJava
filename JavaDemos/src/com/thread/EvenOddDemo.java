package com.thread;

public class EvenOddDemo {

	public static void main(String[] args) 
	{
	
		//main thread working
		System.out.println("I am main thread");
		
		//We are worker threads
		
		EvenOdd thread1=new EvenOdd("Even");
		
			try {
				thread1.t.join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		EvenOdd thread2=new EvenOdd("Odd");
	}
}
