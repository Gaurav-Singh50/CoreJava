package com.nagarro.comparators;

import java.util.Comparator;

import com.nagarro.models.Tshirt;

public class BothSort implements Comparator<Tshirt> {

	public int compare(Tshirt tshirt1, Tshirt tshirt2) {
		int result = (int) (tshirt1.getPrice() - tshirt2.getPrice());
		if (result == 0) {
			result = Float.compare(tshirt2.getRating(), tshirt1.getRating());
		}
		return result;
	}

}
