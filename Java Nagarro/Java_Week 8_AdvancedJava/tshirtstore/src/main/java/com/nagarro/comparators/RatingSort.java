package com.nagarro.comparators;

import java.util.Comparator;

import com.nagarro.models.Tshirt;

public class RatingSort implements Comparator<Tshirt> {

	public int compare(Tshirt tshirt1, Tshirt tshirt2) {
		int result = (int) (tshirt2.getRating() - tshirt1.getRating());
		return result;
	}

}
