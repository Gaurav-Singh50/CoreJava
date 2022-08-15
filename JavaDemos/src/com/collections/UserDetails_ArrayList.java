package com.collections;

import java.util.ArrayList;

public class UserDetails_ArrayList 
{

	ArrayList<UserDetails>userlist;
	UserDetails ud;
	
	public UserDetails_ArrayList()
	{
		
		userlist=new ArrayList<UserDetails>();
	}
	
	
	public void addUsers()
	{
		ud=new UserDetails("Scott", "scott@gmail.com", "6677878");
		userlist.add(ud);
		userlist.add(new UserDetails("smith", "smith@gmail.com", "78879889"));
		
	}
	
	public void viewUsers()
	{
		
		for(UserDetails u:userlist)
		{
			
			System.out.println("Name of user is "+u.getName());
			System.out.println("Email of user is "+u.getEmail());
			System.out.println("Phone of user is "+u.getPhone());
		}
			
		
	}
	
	public static void main(String[] args) 
	{
		UserDetails_ArrayList obj=new UserDetails_ArrayList();
			obj.addUsers();
			obj.viewUsers();
	}
	
}
