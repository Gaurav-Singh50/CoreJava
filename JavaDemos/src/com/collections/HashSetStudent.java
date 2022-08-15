package com.collections;

import java.util.HashSet;

import com.beans.Student;

public class HashSetStudent {

	
	public static void main(String[] args) {
		
		
		HashSet<Student>set=new HashSet<Student>();
		
				set.add(new Student("scott", 1));
				set.add(new Student("scott",1));
				set.add(new Student("john",1));
				System.out.println(set);
				
	}
}
