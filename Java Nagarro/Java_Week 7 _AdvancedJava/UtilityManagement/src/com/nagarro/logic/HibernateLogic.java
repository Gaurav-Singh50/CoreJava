package com.nagarro.logic;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nagarro.model.User;

public class HibernateLogic
{
	public static SessionFactory sf = new Configuration().configure().
			addAnnotatedClass(User.class).buildSessionFactory();

}

