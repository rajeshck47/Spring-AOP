package com.spring.a.simpleExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.a.simpleExample.ShapeService;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/a/simpleExample/SpringCfg.xml");
		ShapeService shape = context.getBean("shapeBean", ShapeService.class);

		System.out.println("-------Triangle Name-------" + shape.getTriangle().getName());
		System.out.println("-------Circle Name---------" + shape.getCircle().getName());

	}

}
