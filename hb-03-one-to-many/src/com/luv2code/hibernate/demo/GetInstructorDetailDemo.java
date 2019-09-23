package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class GetInstructorDetailDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			//get the instructor detail object
			int theId = 7;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			
			
			//print instructor detail
			System.out.println(tempInstructorDetail);
			
			//print the associated instructor
			System.out.println(tempInstructorDetail.getInstructor());

			session.getTransaction().commit();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally{
			factory.close();
			session.close();
		}

	}

}
