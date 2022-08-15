package com.thread;

import java.io.*;

public class FileOperations {

	BufferedReader br;
	BufferedWriter bw;
	Thread t;

	synchronized void fileRead(File f) {
		System.out.println(f.getName());
		System.out.println(f.isDirectory());

		t = Thread.currentThread();
		System.out.println("in read" + t.getName());
		try (BufferedReader br = new BufferedReader(new FileReader(f));) {
			String data = "";

			while ((data = br.readLine()) != null) {
				System.out.println(data);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}

	synchronized void fileWrite(File f) {
		t = Thread.currentThread();
		System.out.println("in write" + t.getName());
		try {

			System.out.println("Enter name and Email for three users");
			br = new BufferedReader(new InputStreamReader(System.in));

			bw = new BufferedWriter(new FileWriter(f));

			for (int i = 1; i <= 3; i++) {

				System.out.println("Enter Name");
				String name = br.readLine();
				System.out.println("Enter Email");
				String email = br.readLine();
				bw.write(name);
				bw.write("\t");
				bw.write(email);
				bw.newLine();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.println("All the information has been written");

		} catch (IOException ie) {
			System.out.println(ie);
		} finally {

			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			}

			catch (IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
