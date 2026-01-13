package com.ShripadJoshi1.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 

public class hibernateConfig {
	
	private static SessionFactory sessionFactory =null;
	static {
		sessionFactory = new Configuration().configure("shri.xml").buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
