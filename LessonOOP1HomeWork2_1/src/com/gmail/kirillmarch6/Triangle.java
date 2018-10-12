package com.gmail.kirillmarch6;

public class Triangle extends Shape {
	
	private Point pointOne;
	private Point pointTwo;
	private Point pointThree;
	
	
	
	public Triangle(Point pointOne, Point pointTwo, Point pointThree) {
		super();
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.pointThree = pointThree;
	}

	public Triangle() {
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

	public Point getPointThree() {
		return pointThree;
	}

	public void setPointThree(Point pointThree) {
		this.pointThree = pointThree;
	}

	public double getPerimetr( ) {
		double perimetr = 0;
		double ab = 0;
		double bc = 0;
		double ac = 0;
		
		ab = Math.sqrt(Math.pow((pointTwo.getX() - pointOne.getX()), 2) + Math.pow((pointTwo.getY() - pointOne.getY()), 2)) ;	
		bc = Math.sqrt(Math.pow((pointThree.getX() - pointTwo.getX()), 2) + Math.pow((pointThree.getY() - pointTwo.getY()), 2)) ;	
		ac = Math.sqrt(Math.pow((pointThree.getX() - pointOne.getX()), 2) + Math.pow((pointThree.getY() - pointOne.getY()), 2)) ;	
		
		perimetr = ab + bc + ac;
		return perimetr; 
	}
	
	public double getArea() {
		double area = 0;
		area = Math.abs((pointOne.getX() - pointThree.getX())*(pointTwo.getY() - pointThree.getY()) - 
				(pointTwo.getX() - pointThree.getX())*(pointOne.getY() - pointThree.getY()))/2;
		return area;
	}

	@Override
	public String toString() {
		return "Triangle";
	}
	
	

}
