package com.demo.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.demo.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + "  Adding an Account");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + ": doing some work");
		return true;
	}
}
