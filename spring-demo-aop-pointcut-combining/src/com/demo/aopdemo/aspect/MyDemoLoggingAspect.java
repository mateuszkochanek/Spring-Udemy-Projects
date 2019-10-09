package com.demo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Pointcut("execution( * com.demo.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n -----> @Before executing before add() methods");
	}
	
	@Before("forDaoPackage()")
	public void performApiAnalitics() {
		System.out.println("\n -----> @Before executing api analitics");
	}
}
