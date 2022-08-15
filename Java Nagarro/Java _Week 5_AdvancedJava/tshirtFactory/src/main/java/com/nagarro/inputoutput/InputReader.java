package com.nagarro.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.nagarro.tshirtFactory.exception.InputException;
import com.nagarro.tshirtFactory.model.Tshirt;

public class InputReader {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Tshirt tshirtFinder() throws Exception {
		Tshirt tshirt = new Tshirt();
		System.out.println("Enter color of the shirt : ");
		tshirt.setColor(br.readLine().toString().toUpperCase());
		System.out.println("Enter Size [S/M/L/XL/XXL]");
		String size = br.readLine().toString().toUpperCase();
		if (size.equalsIgnoreCase("S") || size.equalsIgnoreCase("M") || size.equalsIgnoreCase("L")
				|| size.equalsIgnoreCase("XL") || size.equalsIgnoreCase("XXL")) {
			tshirt.setSize(size);
		} else {
			throw new InputException("Please enter correct input :");

		}
		System.out.println("Enter Gender [M/F/U] (Male,Female,Unisex)");
		String gender = br.readLine().toString().toUpperCase();
		if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("U")) {
			tshirt.setGender(gender);
		} else {
			throw new InputException("Please enter correct input :");
		}
		System.out.println("Enter Output Preference [Price/Rating/Both]");
		String preference = br.readLine().toString().toUpperCase();
		if (preference.equalsIgnoreCase("Price") || preference.equalsIgnoreCase("Rating")
				|| preference.equalsIgnoreCase("Both")) {
			tshirt.setPreference(preference);
		} else {
			throw new InputException("Please enter correct input :");
		}
		return tshirt;
	}

}
