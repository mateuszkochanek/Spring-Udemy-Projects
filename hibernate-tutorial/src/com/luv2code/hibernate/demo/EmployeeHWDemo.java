package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class EmployeeHWDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg2.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			
			//______________saving employee________________
			/*Employee myEmployee1 = new Employee("Mateusz", "Kochanek", "4value");
			Employee myEmployee2 = new Employee("Ron", "Potter", "Regalia");
			Employee myEmployee3 = new Employee("Donald", "Duck", "Golden");
			
			session.save(myEmployee1);
			session.save(myEmployee2);
			session.save(myEmployee3);
			
			session.getTransaction().commit();*/
			
			//______________retriving object______________
			/*int myID = 2;
			Employee myEmployee =session.get(Employee.class, myID);
			System.out.println("Employee with id=1: " + myEmployee.getFirstName());
			session.getTransaction().commit();*/
			
			//______________retriving list of objects with query______________
			/*List <Employee> theEmployees = session.createQuery("from Employee").getResultList();
			for(Employee tempEmployee : theEmployees) {
				System.out.println(tempEmployee);
			}*/
			
			//______________deleting object with id______________
			/*int myID = 2;
			Employee delEmployee = session.get(Employee.class, myID);
			session.delete(delEmployee);*/
			
			
			session.getTransaction().commit();
			
			
		}
		finally{
			factory.close();
		}
	}

}
