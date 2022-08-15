package com.nagarro.tshirtFactory.interfimplementation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import com.nagarro.findnewCsv.FindNewAddedFiles;
import com.nagarro.interf.CSVScanners;
import com.nagarro.tshirtFactory.model.Tshirt;
import com.nagarro.tshirtFactory.sortpreference.BothSort;
import com.nagarro.tshirtFactory.sortpreference.PriceSort;
import com.nagarro.tshirtFactory.sortpreference.RatingSort;

public class CsvReader implements CSVScanners {

	public List<Tshirt> getTshirts() throws IOException {

		List<Tshirt> tshirts = new ArrayList<Tshirt>();
		ArrayList<String> list;
		FindNewAddedFiles f = new FindNewAddedFiles();
		list = f.find();

		String inp = "";

		Tshirt tshirt;
		for (String file : list) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			inp = br.readLine();
			inp = br.readLine();
			if (inp == null) {
				System.out.println(file + " " + "is empty.");
			} else {
				while (inp != null) {

					StringTokenizer st = new StringTokenizer(inp, "|");
					tshirt = new Tshirt();
					tshirt.setId(st.nextToken());
					tshirt.setName(st.nextToken());
					tshirt.setColor(st.nextToken());
					tshirt.setGender(st.nextToken());
					tshirt.setSize(st.nextToken());
					tshirt.setPrice(Double.parseDouble(st.nextToken()));
					tshirt.setRating(Float.parseFloat(st.nextToken()));
					tshirt.setAvailable(st.nextToken());
					tshirts.add(tshirt);
					inp = br.readLine();
				}

			}
		}

		return tshirts;
	}

	public List<Tshirt> getAvailableTshirts(Tshirt fs) throws IOException {
		String color = fs.getColor();

		String size = fs.getSize();
		String gender = fs.getGender();
		String preference = fs.getPreference();
		System.out.println("Tshirt Color is : " + color + " Tshirt Size is : " + size + " Gender is : " + gender
				+ " Preference is : " + preference);

		List<Tshirt> ts = getTshirts();

		List<Tshirt> filterTshirts = new ArrayList<Tshirt>();
		for (Tshirt tshirt : ts) {
			if (tshirt.getColor().equalsIgnoreCase(color) && tshirt.getGender().equalsIgnoreCase(gender)
					&& tshirt.getSize().equalsIgnoreCase(size)) {
				filterTshirts.add(tshirt);
			}
		}

		if (preference.equals("PRICE")) {
			Collections.sort(filterTshirts, new PriceSort());
		} else if (preference.equals("RATING")) {
			Collections.sort(filterTshirts, new RatingSort());
		} else {
			Collections.sort(filterTshirts, new BothSort());
		}

		return filterTshirts;
	}

}
