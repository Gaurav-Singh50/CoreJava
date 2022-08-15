package com.io;
import java.io.*;
public class UserInfo
{
	
	File f;
	
	public UserInfo()
	{
		f=new File("f:\\userdetails.txt");
		
	}
	public void writeDetails()
	
	{
		ObjectOutputStream oos=null;
		UserDetails user=new UserDetails();
		user.setAdharno(54566677);
		user.setId("scott@123");
		user.setPass("12345");
		user.setName("Scott");
		
		//File f=new File("f:\\userdetails.txt");
		try {
			oos=new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(user);
			System.out.println("user details has been written using externalization concept");
		}	
		catch(IOException ie)
		{
			System.out.println(ie);
		}
		finally {
			
			try {
				if(oos!=null)
					oos.close();
			}
			catch(IOException ie)
			{
				System.out.println(ie);
			}
			
		}
		
		
		
		
		
	}
	
	
	public void readDetails()
	{
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));)//try with resources
		{
			
			UserDetails details=	(UserDetails)ois.readObject();
			System.out.println("id is "+details.getId());
			System.out.println("password is"+details.getPass());
			System.out.println("AdharNumber is "+details.getAdharno());
			System.out.println("Name is" +details.getName());
			
		}
		catch(IOException|ClassNotFoundException ie)
		{
			System.out.println(ie);
		}
		
		
	}
	
	

	public static void main(String[] args)
	{
	
		UserInfo u=new UserInfo();
			//u.writeDetails();
			u.readDetails();
	}
}
