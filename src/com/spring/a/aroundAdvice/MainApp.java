package com.spring.a.aroundAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.a.aroundAdvice.ShapeService;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/a/aroundAdvice/SpringCfg.xml");
		ShapeService shape = context.getBean("shapeBean", ShapeService.class);
		shape.getCircle().setName("Rajesh Here");
		
		shape.getTriangle().getName();
		System.out.println("----------------------------------------");
		shape.getCircle().getName();

	}

}
