package com.nagarro.tshirtFactory.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Query;

@NamedQuery(name = "findByName", query = "Select t from Tshirt as t where t.colour=:colour and  t.gender=:gender and t.size=:size")

@Entity
public class Tshirt {

	@Id
	public String id;
	public String name;
	public String colour;
	public String gender;
	public String size;
	public Double price;
	public Float rating;
	public String available;
	public String preference;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcolour() {
		return colour;
	}

	public void setcolour(String colour) {
		this.colour = colour;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Tshirt(String id, String name, String colour, String gender, String size, String preference, float rating,
			double price, String available) {

		this.id = id;
		this.name = name;
		this.colour = colour;
		this.gender = gender;
		this.size = size;
		this.preference = preference;
		this.rating = rating;
		this.price = price;
		this.available = available;
	}

	public Tshirt(String id, String name, String colour, String gender, String size, Double price, Float rating,
			String available) {

		this.id = id;
		this.name = name;
		this.colour = colour;
		this.gender = gender;
		this.size = size;
		this.price = price;
		this.rating = rating;
		this.available = available;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public Tshirt() {

	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	@Override
	public String toString() {
		return "Tshirt [id=" + id + ", name=" + name + ", colour=" + colour + ", gender=" + gender + ", size=" + size
				+ ", price=" + price + ", rating=" + rating + ", available=" + available + ", preference=" + preference
				+ "]";
	}

}
