package com.spring.a.afterReturning;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspects {

	@Before("allGetters()")
	public void loggingAdviceB() {
		System.out.println("@Before loggingAdviceB method...");
	}

	@After("args(name)")
	public void allAfterTest(String name) {
		System.out.println("allAfterTest method===>" + name);
	}

	@AfterReturning("args(name)")
	public void allAfterReturningTest(String name) {
		System.out.println("allAfterReturningTest method---->" + name);
	}

	/*
	 * This is the method which I would like to execute when any method returns.
	 */
	@AfterReturning(pointcut = "allGetters()", returning = "retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning retVal======>" + retVal.toString());
	}
	
	@AfterReturning(pointcut = "args(name)", returning = "retVal")
	public void afterReturningAdvice(String retVal,String name) {
		System.out.println("Returning name======>" + name);
		System.out.println("Returning retVal======>" + retVal);
	}
	
	// note:-execute will take parameter as a methods.
	// @Pointcut("execution(public * get*())")
	@Pointcut("execution(public String getName())")
	public void allGetters() {
	}

}
