package com.nagarro.initializer;

import java.io.IOException;
import java.util.Date;

import com.nagarro.dao.CsvReader;

public class Initializer {
	public static long startTime;
	public void initialize() {
		CsvReader reader = new CsvReader();
		Date date = new Date();
		startTime = date.getTime();
		try {
			reader.addToDatabase();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
}
