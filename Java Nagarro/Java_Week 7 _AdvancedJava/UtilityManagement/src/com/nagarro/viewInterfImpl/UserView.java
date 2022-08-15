package com.nagarro.viewInterfImpl;

import org.hibernate.Session;

import com.nagarro.logic.HibernateLogic;
import com.nagarro.model.User;
import com.nagarro.viewInterf.UserViewInterface;

public class UserView implements UserViewInterface {

	Session session=HibernateLogic.sf.openSession();

	public boolean resetPassword(String username, String newPassword)
	{
		User user = null;
		try {
			session.getTransaction().begin();
			user = session.get(User.class, username);
			user.setPassword(newPassword);
			session.update(user);
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(user==null)
		{
			return false;
		}
		return true;	
	}

	public User getUser(String username)
	{
		User user=null;
		try {
			session.getTransaction().begin();
			user = session.get(User.class, username);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return user;
	}

	public boolean isUser(String username, String password)
	{
		try {
			User user=new User();
			session.getTransaction().begin();
			user = session.get(User.class, username);
			System.out.println(user.getUsername());
			if(user.getUsername() != null && user.getPassword().equals(password))
				return true;
			else
				return false;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return false;	
	}

	public boolean addUser(String username, String email, String firstname, String lastname, String password) {
		User us=new User();
		try {
			session.getTransaction().begin();
			us.setUsername(username);
			us.setEmail(email);
			us.setFirstname(firstname);
			us.setLastname(lastname);
			us.setPassword(password);
			session.save(us);
			session.getTransaction().commit();
		}catch(Exception e) {
			System.out.println(e);
		}
		if(us==null)
			return false;
		else
			return true;
	}

}
