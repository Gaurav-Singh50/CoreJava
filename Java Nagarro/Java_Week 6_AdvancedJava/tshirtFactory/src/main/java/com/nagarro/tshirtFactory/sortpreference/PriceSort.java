package com.nagarro.tshirtFactory.sortpreference;

import java.util.Comparator;

import com.nagarro.tshirtFactory.model.Tshirt;

public class PriceSort implements Comparator<Tshirt> {

	public int compare(Tshirt tshirt1, Tshirt tshirt2) {
		int result = (int) (tshirt1.getPrice() - tshirt2.getPrice());
		return result;
	}

}
