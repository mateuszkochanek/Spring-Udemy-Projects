package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class CreateCoursesDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {

			//start a transaction
			session.beginTransaction();
			
			//get the instructor from db
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			//create some courses
			Course tempCourse1 = new Course("Bouldering - Get to the TOP!");
			Course tempCourse2 = new Course("Coding for Dummies? nope...");

			//add courses to instructor
			tempInstructor.add(tempCourse1);
			tempInstructor.add(tempCourse2);

			//save courses
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			
			
			session.getTransaction().commit();
		}
		finally{
			session.close();
			
			factory.close();
		}

	}

}
