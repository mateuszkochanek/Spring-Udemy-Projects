package com.demo.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAopExpressions {

	@Pointcut("execution( * com.demo.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution( * com.demo.aopdemo.dao.*.set*(..))")
	public void setters() {}
	
	@Pointcut("execution( * com.demo.aopdemo.dao.*.get*(..))")
	public void getters() {}
	
	@Pointcut("forDaoPackage() && !(getters() || setters())")
	public void forDaoPackageNoGettersSetters() {}
}
