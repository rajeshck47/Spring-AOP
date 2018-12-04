package com.spring.a.simpleExample;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspects {

	@Before("execution(public String getName())")
	public void loggingAdviceBefore(){
		System.out.println("loggingAdviceBefore Defaults for all getName() methods...");
	}
	@After("execution(public String getName())")
	public void loggingAdviceAfter(){
		System.out.println("loggingAdviceAfter Defaults for all getName() methods...");
	}
	
	
	
	@Before("execution(public String com.spring.a.simpleExample.Triangle.getName())")
	public void loggingAdvice1(){
		System.out.println("logging Advice Triangle...");
	}
	
	@Before("execution(public String com.spring.a.simpleExample.Circle.getName())")
	public void loggingAdvice2(){
		System.out.println("logging Advice Circle...");
	}
}
