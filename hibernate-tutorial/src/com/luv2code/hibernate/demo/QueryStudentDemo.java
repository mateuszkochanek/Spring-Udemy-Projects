package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;


public class QueryStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();

			//querry all students
			List<Student> theStudents = session.createQuery("from Student").getResultList();	
			displayStudents(theStudents);
			
			//querry students lastName=Doe
			theStudents = session.createQuery("from Student s where s.lastName = 'Data'").getResultList();
			displayStudents(theStudents);
			
			session.getTransaction().commit();
		}
		finally{
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
