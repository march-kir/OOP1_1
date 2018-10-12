package com.gmail.kirillmarch6;

public class Main {

	public static void main(String[] args) {
		
		Point x = new Point(2, 4);
		Point y = new Point(5, 8);
		
		Point a = new Point(-1,4);
		Point b = new Point(-1,2);
		Point c = new Point(-7,3);
		
		Circle circle = new Circle(x, y);
		System.out.println(circle.getPerimetr());
		System.out.println(circle.getArea());
		
		Triangle triangle = new Triangle(a,b,c);
		System.out.println(triangle.getPerimetr());
		System.out.println(triangle.getArea());

	}

}
