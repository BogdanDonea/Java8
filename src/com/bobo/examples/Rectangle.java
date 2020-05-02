package com.bobo.examples;

/**
 * 6. Input the dimensions of a rectangle and display area and perimeter
 * @author Bogdan D.
 */

import java.util.Scanner;

public class Rectangle {

	public Rectangle() {
		
		// Input the dimensions of a rectangle and keep the values in two variables: length and width
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n6. Enter the length of the rectangle: ");
		int length = scanner.nextInt();
		// error message if length is less than 1:
		while (length < 1) {
			// re-enter the value of length
			System.out.println("The length should be > 0. Please enter the length: ");
			length = scanner.nextInt();
		}
		System.out.println("Good. Now enter the width of the rectangle to display area and perimeter: ");
		int width = scanner.nextInt();
		// error message if width is less than 1:
		while (width < 1) {
			// re-enter the value of width
			System.out.println("The width should be > 0. Please enter the width: ");
			width = scanner.nextInt();
		}
		// display area and perimeter:
		System.out.println("Perimeter is equal to " + (2*(length + width)) );
		System.out.println("Area is equal to " + (length * width) );
	}

}
