package com.io;

import java.io.*;

public class KeyBoardInput {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {

			
			//BufferedInputStream bis=new BufferedInputStream(System.in);
								
					
			br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Your name");
			String name = br.readLine();

			System.out.println("Enter Your age");
			int age = Integer.parseInt(br.readLine());

			System.out.println("Enter Your Salary");
			float salary = Float.parseFloat(br.readLine());
			if (age >= 18) {
				System.out.println(name + "You can open account " + "Your Salary is " + salary);
			} else {

				System.out.println("Wait for few more years");
			}

		}

		catch (IOException ie) {

			System.out.println(ie);
		}

		finally {

			try {
				if (br != null)
					br.close();
			} catch (IOException ie)

			{
				System.out.println(ie);
			}
		}
	}

}
