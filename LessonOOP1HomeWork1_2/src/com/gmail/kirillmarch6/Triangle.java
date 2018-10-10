package com.gmail.kirillmarch6;

public class Triangle {

	private double sideOne;
	private double sideTwo;
	private double sideThree;


	public Triangle(double sideOne, double sideTwo, double sideThree) {
		super();
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public Triangle() {
		super();
	}

	
	public double getSideOne() {
		return sideOne;
	}

	public void setSideOne(double sideOne) {
		this.sideOne = sideOne;
	}

	public double getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}

	public double getSideThree() {
		return sideThree;
	}

	public void setSideThree(double sideThree) {
		this.sideThree = sideThree;
	}

	public double getArea() {
		double poluperimetr;
		double area;
		poluperimetr = (sideOne + sideTwo + sideThree) / 2;
		area = Math.sqrt(
				(poluperimetr * (poluperimetr - sideOne) * (poluperimetr - sideTwo) * (poluperimetr - sideThree)));
		return area;
	}

}
