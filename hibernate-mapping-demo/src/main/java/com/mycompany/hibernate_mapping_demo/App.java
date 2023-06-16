package com.mycompany.hibernate_mapping_demo;

import org.hibernate.Session;

import com.mycompany.hibernate_mapping_demo.factory.MyHibernateFactory;
import com.mycompany.hibernate_mapping_demo.model.Instructor;
import com.mycompany.hibernate_mapping_demo.model.InstructorDetail;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	Session session = MyHibernateFactory.getMySession();
        	InstructorDetail instructorDetail = new InstructorDetail();
        	instructorDetail.setYoutubeChannel("luv2code");
        	instructorDetail.setHobby("Designing");
        	
        	Instructor instructor = new Instructor();
        	instructor.setFirstName("Meena");
        	instructor.setLastName("Kumari");
        	instructor.setEmail("meenakumari@email.com");
        	instructor.setInstructorDetail(instructorDetail);
        	
        	session.getTransaction().begin();
        	session.persist(instructor);
        	session.persist(instructorDetail);
        	session.getTransaction().commit();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}

