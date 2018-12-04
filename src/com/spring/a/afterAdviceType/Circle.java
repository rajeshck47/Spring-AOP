package com.spring.a.afterAdviceType;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("--------In Circle setName(String name), setter Method-----------");
	}
}
