package com.io;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {

			fis = new FileInputStream("e:\\abc.txt");
			fos = new FileOutputStream("e:\\copyabc.txt");

			int ch = 0;
			long t1 = System.currentTimeMillis();

			while ((ch = fis.read()) != -1) {
				fos.write(ch);
			}
			long t2 = System.currentTimeMillis();

			System.out.println("FileCopied in " + (t2 - t1) + "milliseconds");
		}

		catch (FileNotFoundException fe) {
			System.out.println(fe);
		}

		catch (IOException ie) {
			System.out.println(ie);
		}

		finally {
			try {
				if (fis != null)
					fis.close();

				if (fos != null)
					fos.close();

			} catch (IOException ie) {
				System.out.println(ie);
			}

		}

	}

}
