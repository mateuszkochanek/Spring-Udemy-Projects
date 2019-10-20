package com.demo.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.demo.aopdemo.Account;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

	
	@Before("com.demo.aopdemo.aspect.DemoAopExpressions.forDaoPackageNoGettersSetters()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n -----> @Before executing add account?3");
		
		//method signature
		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
		System.out.println("Method: " + methodSig);
		
		//method arguments
		Object[] args = theJoinPoint.getArgs();
		
		for(Object tempArg : args) {
			System.out.println(tempArg);
			
			if(tempArg instanceof Account) {
				Account theAccount = (Account) tempArg;
				System.out.println("Name: " + theAccount.getName());
				System.out.println("Level: " + theAccount.getLevel());
			}
		}
		
		
	}

}
