package com.mcit.webapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mcit.webapp.entity.EProduct;

public class HibernateSessionUtil {
	
	private static SessionFactory factory;
	
	public static SessionFactory buildSessionFactory() {
		
		factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(EProduct.class)
				.buildSessionFactory();
		return factory;
	}

}
