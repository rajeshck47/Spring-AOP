package com.spring.a.afterThrowing;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("--------In Circle setName(String name), setter Method-----------");
		//throw(new RuntimeException());
	}
	public String setNameReturn(String name) {
		this.name = name;
		System.out.println("--------In Circle setNameReturn(String name), setter Method-----------");
		return name;
	}
}
