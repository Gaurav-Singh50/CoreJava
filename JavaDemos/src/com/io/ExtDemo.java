package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExtDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File f=new File("f:\\extdemo.txt");
		User u=new User();
		u.setId("scott@gmail.com");
		u.setPass("12343");
		u.setEmail("abc@gmail.com");
		u.setName("Scott");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(u);
		System.out.println("object written");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
		User obj=	(User)ois.readObject();
		System.out.println(obj.getId());
		System.out.println(obj.getPass());
		System.out.println(obj.getName());
		
	}
}
