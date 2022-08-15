package com.thread;

public class NamePrinting {

	public static void main(String[] args) throws InterruptedException {
		String name="Swasti";
		for(int i=0;i<name.length();i++)
		{
			
			
			System.out.print(name.charAt(i));
			Thread.sleep(2000);
		}
		
		
		
	}
}
