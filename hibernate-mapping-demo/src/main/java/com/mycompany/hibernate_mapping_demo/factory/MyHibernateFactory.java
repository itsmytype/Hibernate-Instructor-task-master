package com.mycompany.hibernate_mapping_demo.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_mapping_demo.model.Instructor;
import com.mycompany.hibernate_mapping_demo.model.InstructorDetail;

public class MyHibernateFactory {
	private static SessionFactory factory;
	private static Session session;
	
	public static Session getMySession() {
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		return session;
				
	}
}
