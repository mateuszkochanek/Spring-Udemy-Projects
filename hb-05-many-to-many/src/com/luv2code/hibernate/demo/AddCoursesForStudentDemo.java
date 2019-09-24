package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;


public class AddCoursesForStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {

			//start a transaction
			session.beginTransaction();
			
			int theId = 2;
			Student tempStudent = session.get(Student.class, theId);
			
			Course tempCourse1 = new Course("programming");
			Course tempCourse2 = new Course("swordsmanship");
			Course tempCourse3 = new Course("archery");
			
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			tempCourse3.addStudent(tempStudent);
			
			session.save(tempCourse1);
			session.save(tempCourse2);
			session.save(tempCourse3);

			
			
			session.getTransaction().commit();
		}
		finally{
			session.close();
			
			factory.close();
		}

	}

}
