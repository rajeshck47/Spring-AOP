package com.spring.a.wildCard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.a.wildCard.ShapeService;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/a/wildCard/SpringCfg.xml");
		ShapeService shape = context.getBean("shapeBean", ShapeService.class);

		System.out.println("-------Triangle Name-------" + shape.getTriangle().getName());
		//System.out.println("-------Circle Name---------" + shape.getCircle().getName());

	}

}
