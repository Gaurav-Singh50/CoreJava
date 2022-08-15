package com.innerclasses;

public class AnonymousDemo {
	
	public static void main(String[] args)
	
	{
		
	Animal a=	new Animal()//Anonymus class Object
		{
			
			public void sound()
			{
				System.out.println("Roar");
			}

			@Override
			public void eat() {
				System.out.println("Flesh");
				
			}
			
			
			
		};//class close
		
		
	a.sound();
	a.eat();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}//main method close

}
