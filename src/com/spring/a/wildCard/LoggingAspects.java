package com.spring.a.wildCard;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspects {

		
	//@Before("execution(public String get*())")   //matches any name begins with get.
	//@Before("execution(public String getName(..))")   //matches zero or more arguments.
	//@Before("execution(public String getName(*))")   //matches any no.of arguments.
	//@Before("execution(public * getName(..))")   //matches any return type.
	//@Before("execution(* getName())")   //matches any return type but not used specifier.
	@Before("execution(public String get*())")
	public void loggingAdvice1(){
		System.out.println("logging Advice Triangle...");
	}
	
	@After("execution(public * com.spring.a.wildCard.*.getN*())")
	public void loggingAdvice2(){
		System.out.println("logging Advice Circle...");
	}
}
