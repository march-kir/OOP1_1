//перевод числа из бинарной системы в десятичную

package com.gmail.kirillmarch6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		getNumberInDecimalFormat();
	}

	/**
	 * Get number in Decimal format
	 * 
	 */
	public static void getNumberInDecimalFormat() {
		System.out.println("Input number in binary format");
		Scanner sc = new Scanner(System.in);
		try {
			int number = sc.nextInt(2);
			System.out.println("The number in decimal format - " + number);
		} catch (Exception e) {
			System.out.println("The number is not in binary format");
		}
	}

}
