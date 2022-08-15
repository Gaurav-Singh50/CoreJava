package com.inter_face;

public class RunTimeDemo {
public static void main(String[] args) 
{
	ActionListener al=null;
	Teacher t=new Teacher();
	Student s=new Student();
	al=t;
	//s.show();
	al.actionPerformed();
	al=s;
	al.actionPerformed();
	//al.show();
	//al.exam();
	
	s.exam();
	/*
	 * ActionListener al1=new Teacher(); al1.actionPerformed(); ActionListener al2
	 */
}
}
