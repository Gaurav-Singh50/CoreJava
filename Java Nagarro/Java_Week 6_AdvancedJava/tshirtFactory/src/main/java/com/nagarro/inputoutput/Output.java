package com.nagarro.inputoutput;

import java.util.List;

import com.nagarro.tshirtFactory.model.Tshirt;

public class Output {

	public void display(List<Tshirt> availableTshirts) {
		System.out.println("\n*************** Available Tshirts *************************");

		for (int i = 0; i < availableTshirts.size(); i++) {
			System.out.println("Tshirt Id: " + availableTshirts.get(i).id);
			System.out.println("Tshirt Name: " + availableTshirts.get(i).name);
			System.out.println("Tshirt Colour: " + availableTshirts.get(i).colour);
			System.out.println("Tshirt Gender: " + availableTshirts.get(i).gender);
			System.out.println("Tshirt Size: " + availableTshirts.get(i).size);
			System.out.println("Tshirt Rating: " + availableTshirts.get(i).rating);
			System.out.println("Tshirt Availability: " + availableTshirts.get(i).available);
			System.out.println(availableTshirts.get(i).colour);

		}
	}

}
