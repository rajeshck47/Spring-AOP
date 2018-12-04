package com.spring.a.afterReturning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.a.afterReturning.ShapeService;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/a/afterReturning/SpringCfg.xml");
		ShapeService shape = context.getBean("shapeBean", ShapeService.class);
		shape.getTriangle().setName("Rajesh Here");
		shape.getCircle().setNameReturn("Returning Rajesh name");
		//System.out.println("-------Triangle Name-------" + shape.getTriangle().getName());
		System.out.println("-------Circle Name---------" + shape.getCircle().getName());

	}

}
