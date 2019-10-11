package com.demo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudConnectingAspect {

	@Before("com.demo.aopdemo.aspect.DemoAopExpressions.forDaoPackageNoGettersSetters()")
	public void logToCloudAsync() {
		System.out.println("\n -----> @Before logging to cloud1");
	}
}
