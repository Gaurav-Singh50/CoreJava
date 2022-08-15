package com.innerclasses;

public class Player {

	private String countryname = "India";

	private String name;

	public void setName(String name) {

		this.name = name;
	}

	public void getName() {

		System.out.println("Player name is" + name);
	}

	class Sports {
		String sportsname;

		public void setDetails(String sportsname) {
			this.sportsname = sportsname;
		}

		public void getDetailS() {
			getName();
			System.out.println("sports name is" + sportsname);
			System.out.println("country name is " + countryname);// private instance variable of outer class
		}

	}// member inner class

}// outer class close
