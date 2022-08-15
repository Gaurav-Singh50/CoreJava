package com.nagarro.tshirtFactory.interfimplementation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.nagarro.findnewCsv.FindNewAddedFiles;
import com.nagarro.interf.CSVScanners;
import com.nagarro.tshirtFactory.hibernate.Hibernate;
import com.nagarro.tshirtFactory.model.Tshirt;
import com.nagarro.tshirtFactory.sortpreference.BothSort;
import com.nagarro.tshirtFactory.sortpreference.PriceSort;
import com.nagarro.tshirtFactory.sortpreference.RatingSort;

public class CsvReader implements CSVScanners {
	public static Session session = Hibernate.createConnection();

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
					tshirt.setcolour(st.nextToken());
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
		String colour = fs.getcolour();

		String size = fs.getSize();
		String gender = fs.getGender();
		String preference = fs.getPreference();
		System.out.println("Tshirt colour is : " + colour + " Tshirt Size is : " + size + " Gender is : " + gender
				+ " Preference is : " + preference);

		List<Tshirt> ts = getTshirts();
		for (int i = 0; i < ts.size(); i++) {
			Tshirt tshirt1 = ts.get(i);
			String id = tshirt1.id;
			String name = tshirt1.name;
			String colour1 = tshirt1.colour;
			String gender1 = tshirt1.gender;
			String size1 = tshirt1.size;
			Double price = tshirt1.price;
			Float rating = tshirt1.rating;
			String available = tshirt1.available;
			Tshirt t = new Tshirt(id, name, colour1, gender1, size1, price, rating, available);

			Transaction transaction = session.beginTransaction();
			session.save(t);
			transaction.commit();

		}

		Query<Tshirt> query = session.getNamedQuery("findByName");
		query.setParameter("colour", colour);
		query.setParameter("gender", gender);
		query.setParameter("size", size);

		List<Tshirt> filterTshirts = query.list();

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
