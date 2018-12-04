package com.spring.a.customAroundAnnotation;

public class ShapeService {

	private Triangle triangle;
	private Circle circle;
	
	
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	@Loggable
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
		
}
