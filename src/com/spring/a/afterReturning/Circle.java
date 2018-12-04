package com.spring.a.afterReturning;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("--------In Circle setName(String name), setter Method-----------");
	}
	
	public String setNameReturn(String name) {
		this.name = name;
		System.out.println("--------In Circle setNameReturn(String name), setter Method-----------");
		return name;
	}
}
