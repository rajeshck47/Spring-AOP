package com.spring.a.customAroundAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspects {

	@Before("allGetters()")
	public void loggingAdviceB() {
		System.out.println("@Before loggingAdviceB method...");
	}

	@Pointcut("execution(public String getName())")
	public void allGetters() {
		System.out.println("allGetters method...");
	}
	
/*	
	@Around("allGetters()")
	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {

		try {
			System.out.println("Before aroundAdvice...");
			pjp.proceed();
			System.out.println("After aroundAdvice...");
		} catch (Exception e) {
			System.out.println("Inside Catch black aroundAdvice...");
			e.printStackTrace();
		}
		System.out.println("Finally aroundAdvice...");
	}
	
*/
	@Around("@annotation(com.spring.a.customAroundAnnotation.Loggable)")
	public Object aroundAdviceReturn(ProceedingJoinPoint pjp) throws Throwable {

		Object obj = null;
		try {
			System.out.println("Before aroundAdvice...");
			obj = pjp.proceed();
			System.out.println("After aroundAdvice...");
		} catch (Exception e) {
			System.out.println("Inside Catch black aroundAdvice...");
			e.printStackTrace();
		}
		System.out.println("Finally aroundAdvice...");
		return obj;
	}

}
