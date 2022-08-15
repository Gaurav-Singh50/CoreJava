package com.exception;
import java.io.*;
public class CheckedException 
{
	
	void show() throws FileNotFoundException
	{

		
		FileInputStream fis=new FileInputStream("f:\\abc.txt");
	
		
		
	}

public static void main(String[] args) throws FileNotFoundException
{

	CheckedException ck=new CheckedException();
	ck.show();
	
}




}
