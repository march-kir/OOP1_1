package com.gmail.kirillmarch6;

public class Circle extends Shape {
	
	private Point pointOne;
	private Point pointTwo;
	
	public Circle(Point pointOne, Point pointTwo) {
		super();
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
	}

	public Circle() {
		super();
	}

	public Point getPointOne() {
		return pointOne;
	}

	public void setPointOne(Point pointOne) {
		this.pointOne = pointOne;
	}

	public Point getPointTwo() {
		return pointTwo;
	}

	public void setPointTwo(Point pointTwo) {
		this.pointTwo = pointTwo;
	}
	
	public double getPerimetr( ) {
		double radius = 0;
		double perimetr = 0;
		radius = Math.sqrt(Math.pow((pointTwo.getX() - pointOne.getX()), 2) + Math.pow((pointTwo.getY() - pointOne.getY()), 2)) ;	
		perimetr = 2 * Math.PI * radius;		
		return perimetr;
	}
	
	public double getArea() {
		double radius = 0;
		double area = 0;
		radius = Math.sqrt(Math.pow((pointTwo.getX() - pointOne.getX()), 2) + Math.pow((pointTwo.getY() - pointOne.getY()), 2)) ;	
		area = Math.PI * (Math.pow(radius, 2));
		return area;
	}

	@Override
	public String toString() {
		return "Circle";
	}
	
	
	

}
