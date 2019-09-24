package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;


public class GetCourswAndReviewesDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {

			//start a transaction
			session.beginTransaction();
			
			Course tempCourse = new Course("Guitarrr!");
			
			tempCourse.add(new Review("Lovely!"));
			tempCourse.add(new Review("Delightful!"));
			tempCourse.add(new Review("Terrific!"));
			
			//bc of cascade ALL it will save our reviews too
			session.save(tempCourse);
			
			
			session.getTransaction().commit();
		}
		finally{
			session.close();
			
			factory.close();
		}

	}

}
