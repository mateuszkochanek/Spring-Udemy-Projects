package com.demo.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.aopdemo.dao.AccountDAO;
import com.demo.aopdemo.dao.MembershipDAO;

public class AfterThrowingDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		List<Account> theAccounts = null;
		try {
			theAccounts = theAccountDAO.findAccounts();
		} catch(Exception exc){
			
		}
		
		System.out.println("\n\n Main Program: After Throwing");
		System.out.println("--------");
		System.out.println(theAccounts);
		
		context.close();
	}

}
