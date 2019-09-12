package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;


public class DeleteStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			int studentID = 1;

			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//Student myStudent = session.get(Student.class, studentID);
			//session.delete(myStudent);
			
			session.createQuery("delete from Student where id=2").executeUpdate();
			
			session.getTransaction().commit();
			
			//bulk updating
			/*session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("update Student set email='4value@gmail.com.pl'").executeUpdate();
			
			session.getTransaction().commit();*/
		}
		finally{
			factory.close();
		}

	}

}
