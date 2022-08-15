package com.collections;

import java.util.LinkedList;

import com.beans.Book;

public class LinkedListDemo {
	
	LinkedList<Book>book_linklist;
		public LinkedListDemo() {
			
			book_linklist=new LinkedList<Book>();
			
		}
	
	public void addBooks()
	{
		//Book b=new Book("java", 999.99f);
		//book_linklist.add(b);
		
//			Book b=new Book();
//			b.setName("Java");
//			b.setPrice(556.99f);
//			book_linklist.add(b);
			
		book_linklist.add(new Book("java", 999.99f));
		book_linklist.addFirst(new Book("OCJA", 1500.00f));
		
		System.out.println(book_linklist);
	}
	public void showBooks()
	{
		for(Book b:book_linklist)
		{
		System.out.println("Book name is "+b.getName());
		System.out.println("Book Price is"+b.getPrice());
		//System.out.println(b.getClass());
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		LinkedListDemo list=new LinkedListDemo();
		
			list.addBooks();
			list.showBooks();
		
	}
	
		
}
