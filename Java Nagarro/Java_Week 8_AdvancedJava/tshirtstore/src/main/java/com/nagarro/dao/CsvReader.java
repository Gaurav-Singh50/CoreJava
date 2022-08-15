package com.nagarro.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.nagarro.checkfiles.FindFiles;
import com.nagarro.hibernate.Hibernate;
import com.nagarro.models.Tshirt;

public class CsvReader {

	public void addToDatabase() throws IOException {
		Session session = Hibernate.getSession();

		ArrayList<String> list;
		FindFiles f = new FindFiles();
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
					tshirt.setColour(st.nextToken());
					tshirt.setGender(st.nextToken());
					tshirt.setSize(st.nextToken());
					String brand = file.substring(60, file.indexOf(".csv"));
					tshirt.setBrand(brand);
					tshirt.setPrice(Double.parseDouble(st.nextToken()));
					tshirt.setRating(Float.parseFloat(st.nextToken()));
					tshirt.setAvailable(st.nextToken());

					Transaction transaction = session.beginTransaction();
					session.save(tshirt);
					transaction.commit();
					inp = br.readLine();

				}

			}
			br.close();
		}

	}

}
