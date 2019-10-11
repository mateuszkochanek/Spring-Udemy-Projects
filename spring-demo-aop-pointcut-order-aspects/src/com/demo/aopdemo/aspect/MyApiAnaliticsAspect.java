package com.demo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnaliticsAspect {


	@Before("com.demo.aopdemo.aspect.DemoAopExpressions.forDaoPackageNoGettersSetters()")
	public void performApiAnalitics() {
		System.out.println("\n -----> @Before executing api analitics2");
	}
}
