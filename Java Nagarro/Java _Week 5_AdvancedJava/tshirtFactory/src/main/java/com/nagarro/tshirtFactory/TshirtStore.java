package com.nagarro.tshirtFactory;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.WatchService;
import java.util.Scanner;

import com.nagarro.findnewCsv.*;
import com.nagarro.tshirtFactory.controller.TshirtController;

public class TshirtStore {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		TshirtController tc = new TshirtController();

		try {

			String choice;
			System.out.println("-------------- Welcome To Tshirt Shop --------------------------");
			do {
				tc.function();
				System.out.println("Do you want to search for any other Tshirt ?(Enter y or Y for yes):");
				choice = sc.next();

			} while (choice.equalsIgnoreCase("Y"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
