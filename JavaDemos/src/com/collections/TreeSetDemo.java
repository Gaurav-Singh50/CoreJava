package com.collections;
import java.util.*;
public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<String>courseSet=new TreeSet<String>();
		
		courseSet.add("java");
		courseSet.add("python");
		courseSet.add("java");
		courseSet.add("android");
		courseSet.add("nodejs");
		courseSet.add("reactjs");
		System.out.println(courseSet);
		
	}

}
