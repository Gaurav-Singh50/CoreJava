package com.nagarro.tshirtFactory.sortpreference;

import java.util.Comparator;

import com.nagarro.tshirtFactory.model.Tshirt;

public class RatingSort implements Comparator<Tshirt> {

	public int compare(Tshirt tshirt1, Tshirt tshirt2) {
		int result = (int) (tshirt2.getRating() - tshirt1.getRating());
		return result;
	}

}
