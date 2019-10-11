package com.demo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

	
	@Before("com.demo.aopdemo.aspect.DemoAopExpressions.forDaoPackageNoGettersSetters()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n -----> @Before executing add account?3");
	}

}
