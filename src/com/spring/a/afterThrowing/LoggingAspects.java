package com.spring.a.afterThrowing;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspects {

	@Before("allGetters()")
	public void loggingAdviceB() {
		System.out.println("@Before loggingAdviceB method...");
	}

	
	/*
	 * This is the method which I would like to execute when any method returns.
	 */
	@AfterReturning(pointcut = "args(name)", returning = "retVal")
	public void afterReturningAdvice(String retVal,String name) {
		System.out.println("Returning name======>" + name);
		System.out.println("Returning retVal======>" + retVal.toString());
	}

	/*
	 * This is the method which I would like to execute if there is an exception
	 * raised by any method.
	 */
	// note:- if u want exception then uncomment the exception in circle class.
	@AfterThrowing(pointcut = "allGetters()", throwing = "ex")
	public void AfterThrowingAdvice(Throwable ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}

	// note:-execute will take parameter as a methods.
	// @Pointcut("execution(public * get*())")
	@Pointcut("execution(public String getName())")
	public void allGetters() {
	}

}
