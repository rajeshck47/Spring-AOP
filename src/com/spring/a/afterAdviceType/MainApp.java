package com.spring.a.afterAdviceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.a.afterAdviceType.ShapeService;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/a/afterAdviceType/SpringCfg.xml");
		ShapeService shape = context.getBean("shapeBean", ShapeService.class);
		shape.getTriangle().setName("Rajesh Here");
		//System.out.println("-------Triangle Name-------" + shape.getTriangle().getName());
		System.out.println("-------Circle Name---------" + shape.getCircle().getName());

	}

}
