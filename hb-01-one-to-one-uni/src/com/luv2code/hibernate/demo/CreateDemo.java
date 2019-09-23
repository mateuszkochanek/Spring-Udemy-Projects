package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class CreateDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			//create the objects
			/*Instructor tempInstructor = new Instructor("Chad", "Darby","darby@luv2code.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("https://222.333.444", "coding");
			*/
			Instructor tempInstructor = new Instructor("Mati", "Kochanek","mateuszkochanek01@gmail.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("https://erthax", "Coding");
			
			//associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			//start a transaction
			session.beginTransaction();
			
			//save the instructor
			//Note: Because of CascadeType.ALL it saves the details object
			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);
			//commit transaction
			
			
			session.getTransaction().commit();
		}
		finally{
			factory.close();
		}

	}

}
