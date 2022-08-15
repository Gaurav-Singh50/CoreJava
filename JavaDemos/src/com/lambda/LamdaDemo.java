package com.lambda;

interface Study {
	public void learn();

}

interface Singing {
	public void sing(String songtype);
}

public class LamdaDemo

{
	public static void main(String[] args) {

		/*
		 * new Study() {
		 * 
		 * @Override public void learn() { // TODO Auto-generated method stub
		 * 
		 * } }.learn();
		 */

		Study s = () -> {

			System.out.println("Lamdba Expression");
		};

		s.learn();

		Singing singing = (type) -> {
			System.out.println("song type is " + type);

		};
		singing.sing("Classical");

	}

}
