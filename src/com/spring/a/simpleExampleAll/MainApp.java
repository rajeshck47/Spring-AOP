package com.spring.a.simpleExampleAll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/a/simpleExampleAll/Beans.xml");

		Student student = (Student) context.getBean("student");

		student.getName();
		student.getAge();

		student.printThrowException();
	}

}
