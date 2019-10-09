package com.demo.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.aopdemo.dao.AccountDAO;
import com.demo.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		Account myAccount = new Account();
		
		theAccountDAO.addAccount(myAccount, true);
		theMembershipDAO.addMembership();
		
		theAccountDAO.setName("NAME");
		theAccountDAO.setServiceCode("CODE");
		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();
		
		theAccountDAO.doWork();
		theMembershipDAO.goToSleep();
		
		context.close();
	}

}
