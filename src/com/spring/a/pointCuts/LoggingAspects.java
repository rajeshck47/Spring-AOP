package com.spring.a.pointCuts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspects {

	@Before("allGetters()")
	public void loggingAdviceB(){
		System.out.println("loggingAdviceB method...");
	}
		
	@Before("allGetters()")
	public void loggingAdviceA(){
		System.out.println("loggingAdviceA method...");
	}
	
	
	//combine both point cuts
	@Before("allGetters() && allMethodsInClass()")
	public void loggingAdviceAandB(){
		System.out.println("loggingAdviceA method...");
	}
	
	
	//note:-execute will take parameter as a methods.
	//@Pointcut("execution(public * get*())")
	@Pointcut("execution(public String getName())")
	public void allGetters(){}
	
	
	//note:-within will take parameter as a class
	@Pointcut("within(com.spring.a.wildCard.Circle)") //"within" it will execute all methods in Circle class.
	public void allMethodsInClass(){}
	
	/*
	//note:-args will take parameter as a class,interface.
	@Pointcut("args()") 
	public void allClassInterface(){}
	*/
	
	/*@Pointcut("execution(* * *(..))") 
	public void allGettersInClass(){}*/
	
	
	
}
