package com.lambda;
import java.util.*;
import java.util.function.Consumer;
public class Collection_Lambda {
	public static void main(String[] args) {
		
		ArrayList<String>courselist=new ArrayList<>();
		
	
		courselist.add("java");
		courselist.add("Spring");
		courselist.add("Python");
		courselist.add("AdvanceJava");
		courselist.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {


				System.out.println(t.toUpperCase());
				
			}
		});
		
		
		
		
		
		
	}

}
