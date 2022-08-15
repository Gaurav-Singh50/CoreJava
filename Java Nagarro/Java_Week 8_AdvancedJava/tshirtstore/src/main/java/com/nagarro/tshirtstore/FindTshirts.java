package com.nagarro.tshirtstore;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.nagarro.comparators.BothSort;
import com.nagarro.comparators.PriceSort;
import com.nagarro.comparators.RatingSort;
import com.nagarro.hibernate.Hibernate;
import com.nagarro.models.Tshirt;

public class FindTshirts {

	public static Session session = Hibernate.getSession();

	public List<Tshirt> getAvailableTshirts(HttpServletRequest request, HttpServletResponse response){ 		
		String colour = request.getParameter("color");
		String size = request.getParameter("size");
		String gender = request.getParameter("gender");
		String preference = request.getParameter("preference");
		System.out.println("Tshirt colour is : " + colour + " Tshirt Size is : " + size + " Gender is : " + gender
				+ " Preference is : " + preference);

		
		Criteria criteria = session.createCriteria(Tshirt.class);
		criteria.add(Restrictions.eq("colour", colour));
		criteria.add(Restrictions.eq("gender", gender));
		criteria.add(Restrictions.eq("size", size));
		List<Tshirt> filterTshirts = criteria.list();

		if (preference.equalsIgnoreCase("PRICE")) {
			Collections.sort(filterTshirts, new PriceSort());
		} else if (preference.equalsIgnoreCase("RATING")) {
			Collections.sort(filterTshirts, new RatingSort());
		} else if (preference.equalsIgnoreCase("BOTH")){
			Collections.sort(filterTshirts, new BothSort());
		}
		else {
			
		}

		return filterTshirts;
	}
}
