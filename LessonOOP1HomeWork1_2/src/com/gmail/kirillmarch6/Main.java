package com.gmail.kirillmarch6;

public class Main {

	public static void main(String[] args) {
		
		Triangle tOne = new Triangle(7,7,7);
		Triangle tTwo = new Triangle(7,10.2,9.1);
		Triangle tThree = new Triangle(5,6,10);
		
	 	System.out.println(tOne.getArea());
	 	System.out.println(tTwo.getArea());
	 	System.out.println(tThree.getArea());

	}

}
