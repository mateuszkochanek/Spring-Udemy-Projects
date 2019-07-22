package com.one.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//checking if they are the same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the seme object? " + result);
		System.out.println("\nMemory location for theCoach " + theCoach);
		System.out.println("\nMemory location for alphaCoach " + alphaCoach);
		
		context.close();
	}
}

