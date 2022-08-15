package com.io;

import java.io.*;
public class Buffering_Copy {
	
	
	public static void main(String[] args) 
	{
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			
			br=new BufferedReader(new FileReader("e:\\test.txt"));
			
			bw=new BufferedWriter(new FileWriter("e:\\copytest.txt"));
			
			String data="";
			while((data=br.readLine())!=null)
			{				
				bw.write(data);
				//bw.write("\n");
								
				bw.newLine();
			}
			System.out.println("File Copied");
		
		}
		catch(IOException ie)
		{
			
			System.out.println(ie);
		}
		
		
		finally {
			
			System.out.println("in finally");
			
			try {
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
