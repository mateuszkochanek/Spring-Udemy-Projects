package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;


public class CreateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Creating new student object");
			Student tempStudent = new Student("Paul","Jefferson", "paul@4value.com");
			System.out.println("SAving new student object");
			session.beginTransaction();
			session.save(tempStudent);
			System.out.println("Sending new student object");
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally{
			factory.close();
		}

	}

}
