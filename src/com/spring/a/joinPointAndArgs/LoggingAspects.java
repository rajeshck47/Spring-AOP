package com.spring.a.joinPointAndArgs;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspects {

	@Before("allGetters()")
	public void loggingAdviceB(JoinPoint joinpoint){
		System.out.println("loggingAdviceB method JoinPoint getKind==>"+joinpoint.getKind());
		System.out.println("loggingAdviceB method JoinPoint getTarget==>"+joinpoint.getTarget());
		System.out.println("loggingAdviceB method JoinPoint getSignature==>"+joinpoint.getSignature());
		System.out.println("loggingAdviceB method JoinPoint getSourceLocation==>"+joinpoint.getSourceLocation());
		System.out.println("loggingAdviceB method JoinPoint getStaticPart==>"+joinpoint.getStaticPart());
		System.out.println("loggingAdviceB method JoinPoint getArgs==>"+joinpoint.getArgs().toString());
		System.out.println("loggingAdviceB method JoinPoint toString==>"+joinpoint.toString());
		System.out.println("loggingAdviceB method JoinPoint toLongString==>"+joinpoint.toLongString());
		System.out.println("loggingAdviceB method JoinPoint toShortString==>"+joinpoint.toShortString());
	}
	
	
	
	//note:-args will take parameter as a class,interface and prints all methods which has one parameter.
	@Before("args(name)") 
	public void allArgsTest(String name){
		System.out.println("-------------allArgsTest-------------name==>"+name);
	}
	
	
	//note:-args will take parameter as a class,interface.
	@After("args(name)") 
	public void allClassInterface(String name){
		System.out.println("-----------allClassInterface----------name==>"+name);
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
	public void allMethodsInClass(){
		System.out.println("allMethodsInClass method...");
	}
	
		
	/*@Pointcut("execution(* * *(..))") 
	public void allGettersInClass(){}*/
	

}
