package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;


public class ReadStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			Student tempStudent = new Student("Donald","Duck", "duck@gmail.com");
			session.beginTransaction();
			session.save(tempStudent);
			session.getTransaction().commit();
			
			//getting object from the database
			System.out.println("Saved student. Genereted Id: " + tempStudent.getId());
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("\nGetting student with id:" + tempStudent.getId());
			Student myStudent = session.get(Student.class,  tempStudent.getId());
			
			System.out.println("Get Student: " + myStudent);
			
			session.getTransaction().commit();
		}
		finally{
			factory.close();
		}

	}

}
