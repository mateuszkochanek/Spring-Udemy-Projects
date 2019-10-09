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
	
	@Pointcut("execution( * com.demo.aopdemo.dao.*.set*(..))")
	private void setters() {}
	
	@Pointcut("execution( * com.demo.aopdemo.dao.*.get*(..))")
	private void getters() {}
	
	@Pointcut("forDaoPackage() && !(getters() || setters())")
	private void forDaoPackageNoGettersSetters() {}
	
	@Before("forDaoPackageNoGettersSetters()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n -----> @Before executing before add() methods");
	}
	
	@Before("forDaoPackageNoGettersSetters()")
	public void performApiAnalitics() {
		System.out.println("\n -----> @Before executing api analitics");
	}
}
