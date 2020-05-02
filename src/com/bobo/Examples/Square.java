package com.bobo.Examples;

/**
 * 7. Input the length of the side of a square, and display its area.
 * 	Produce an error message if the length is negative
 *
 * 	@author Bogdan D.
 */

import java.util.Scanner;

public class Square {

	public Square() {
		// Input the length of the side of a square and assign the value to variable length:
		Scanner lengthScanner = new Scanner(System.in);
		System.out.println("\n7. Enter the length of the square to display its area: ");
		int length = lengthScanner.nextInt();
		while (length <= 0) {
			System.out.println("Error! The length should be >0");	
			System.out.println("Enter the length of the square to display its perimeter and area: ");
			length = lengthScanner.nextInt();
		}
		// calculate and display the perimeter and area:
		System.out.println("Perimeter is equal to " + (4 * length) );
		System.out.println("Area equals to: " + (length * length));
	}
}
