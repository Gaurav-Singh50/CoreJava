package com.nagarro.inputoutput;

import java.util.List;

import com.nagarro.tshirtFactory.model.Tshirt;

public class Output {

	public void display(List<Tshirt> availableTshirts) {
		System.out.println("\n*************** Available Tshirts *************************");
		for (Tshirt tshirt : availableTshirts) {
			System.out.println("TshirtId : " + tshirt.getId() + "\nTshirt Name : " + tshirt.getName()
					+ "\nTshirt Color : " + tshirt.getColor() + "\nTshirt Gender : " + tshirt.getGender()
					+ "\nTshirt Size : " + tshirt.getSize() + "\nTshirt Price : " + tshirt.getPrice()
					+ "\nTshirt Rating : " + tshirt.getRating() + "\nTshirt Availability : " + tshirt.getAvailable());
		}

	}

}
