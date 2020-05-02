package com.bobo.examples;

/**
 * 8. Input 3 numbers, and display the biggest.
 *
 * @author Bogdan D.
 */

import java.util.Scanner;

public class BiggestNumber {

	public BiggestNumber() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n8. Input 3 numbers to display the biggest. Enter the first number here: ");
		// declare a variable with identifier 'a' of type int and assign the value entered from keyboard
		int a = scanner.nextInt();
		
		System.out.println("Enter the second number: ");
		// declare a variable with identifier 'b' of type int and assign the value entered from keyboard
		int b = scanner.nextInt();
		
		System.out.println("Enter the third number: ");
		// declare a variable with identifier 'c' of type int and assign the value entered from keyboard
		int c = scanner.nextInt();
		
		// check and display the biggest number from a,b,c:
		if (a>b && a>c) {
			System.out.println("The biggest number is " + a); 	
		} else if (c>b && c>a) {
			System.out.println("The biggest number is " + c); 			
		} else {
			System.out.println("The biggest number is " + b);
		}
	}
}
