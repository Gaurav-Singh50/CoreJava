package com.nagarro.product_catalogue.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deliver")
public class Deliverable {
	
	@Id
	private int pincode;
	private int days;

	public Deliverable() {
		super();
	}

	public Deliverable(int pincode, int days) {
		super();
		this.pincode = pincode;
		days = days;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getdays() {
		return days;
	}

	public void setdays(int days) {
		days = days;
	}

}
