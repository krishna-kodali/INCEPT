package com.ccs.ems.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {

	private static SessionFactory sf;

	static {
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		sf = cfg.buildSessionFactory();
		System.out.println("I am in Static Initialiser");
	}

	public static Session getSession() {

		Session s = sf.openSession();
		// s.save(emp);
		// s.delete(emp);
		return s;
	}
}