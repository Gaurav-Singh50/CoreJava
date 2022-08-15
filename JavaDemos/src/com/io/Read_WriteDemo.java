package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read_WriteDemo {
	public static void main(String[] args) throws IOException {
		ObjectRead_Write obj = new ObjectRead_Write();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String name = br.readLine();
		System.out.println("Enter Email");
		String email = br.readLine();
		System.out.println("Enter age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter weight");
		float weight = Float.parseFloat(br.readLine());
		Student s = new Student(name, email, age, weight);

		obj.student_Write(s);
		br.close();

		obj.student_Read();
	}

}
