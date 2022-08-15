package com.io;

import java.io.*;

public class ObjectRead_Write 
{
	
	
	public void student_Write(Student s)
	{
		ObjectOutputStream oos=null;
		try {
		
		oos=new ObjectOutputStream(new FileOutputStream("f:\\student_data.txt",true));
		oos.writeObject(s);//serialization
		System.out.println("Student Object has been written");
		
		}
		
		catch(IOException ie)
		{
			
			System.out.println(ie);
		}
		
		finally {
			
			try {
				
				if(oos!=null)oos.close();
			}
			catch(IOException ie) {System.out.println(ie);}
			
		}
		
	}
	
	
	public void student_Read()
	{
	
		try(
		ObjectInputStream	ois=new ObjectInputStream(new FileInputStream("f:\\student_data.txt"));//try with resources	
		)						
		{
	
			Student obj=(Student)ois.readObject();//down casting
			//narrowcasting
			obj.getDetails();
			
		
		}
		catch(IOException|ClassNotFoundException ie)
		{
			
			System.out.println(ie);
		}
		
	}
	
	
	
	
	
}
