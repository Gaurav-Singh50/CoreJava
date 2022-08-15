package com.nagarro.tshirtFactory.controller;

import java.util.List;

import com.nagarro.inputoutput.InputReader;
import com.nagarro.inputoutput.Output;
import com.nagarro.tshirtFactory.exception.ListEmptyException;
import com.nagarro.tshirtFactory.interfimplementation.CsvReader;
import com.nagarro.tshirtFactory.model.Tshirt;

public class TshirtController {

	public void function() {
		try {
			System.out.println("Searching for Tshirt in Tshirt Factory");
			Tshirt st = new InputReader().tshirtFinder();
			CsvReader csv = new CsvReader();
			List<Tshirt> availableTshirts = csv.getAvailableTshirts(st);
			if (availableTshirts.size() == 0) {
				throw new ListEmptyException("No matching Tshirt found! \nEnter choice for another available Tshirts");
			} else {
				new Output().display(availableTshirts);
			}

		} catch (ListEmptyException e) {
			System.out.println(e);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
