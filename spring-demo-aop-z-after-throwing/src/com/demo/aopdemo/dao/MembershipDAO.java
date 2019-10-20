package com.demo.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public boolean addMembership() {
		System.out.println(getClass() + " Adding a MembershipAccount");
		return true;
	}
	
	public void goToSleep() {
		System.out.println(getClass() + " time to sleep my friend");
	}
}
