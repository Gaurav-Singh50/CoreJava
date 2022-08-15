package com.thread;
import java.io.*;
public class FileWriterThread  extends Thread
{

	BufferedReader br;
	File f;
	public FileWriterThread(String name)
	{
		setDaemon(true);
		setName(name);
		try {
			br=new BufferedReader(new FileReader("f:\\abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void read()
	{
		String data="";
		try {
			while((data=br.readLine())!=null)
			
			{
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
