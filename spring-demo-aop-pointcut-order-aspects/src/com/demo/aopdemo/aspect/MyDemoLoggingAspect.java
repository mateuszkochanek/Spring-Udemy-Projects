package com.demo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	
	@Before("forDaoPackageNoGettersSetters()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n -----> @Before executing add account?");
	}

}
