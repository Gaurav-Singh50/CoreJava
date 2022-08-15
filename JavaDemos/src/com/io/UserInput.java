package com.io;
import java.io.*;
public class UserInput 
{
	public static void main(String[] args) 
	{
		BufferedReader br=null;
		BufferedWriter bw=null;
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			bw=new BufferedWriter(new FileWriter("f:\\userdetails.txt",true));
			
			System.out.println("Enter Three users Details");
			for(int i=1;i<=3;i++)
			{
			System.out.println("Enter the username");
			String username=br.readLine();
			
			System.out.println("Enter the email");
			String email=br.readLine();
			
			System.out.println("Enter the phone number");
			String phone_no=br.readLine();
			
			bw.write(username);
		
			bw.write(email);
		
			bw.write(phone_no);
			bw.newLine();
			}
			
			
			System.out.println("user details has been written");
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
		
		finally
		{
			try
			{
				if(br!=null)
				br.close();
				
				if(bw!=null)
				bw.close();
			}
			
			catch(IOException ie)
			{
				System.out.println(ie);
			}
			
		}
	}


}
