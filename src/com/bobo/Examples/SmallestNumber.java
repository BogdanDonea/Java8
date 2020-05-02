package com.bobo.Examples;

/**
 * 2. Display the smallest number from a collections of number
 * @author Bogdan D.
 */

import java.util.Scanner;

public class SmallestNumber {

	public SmallestNumber() {
		
		// input 5 numbers from keyboard
		System.out.println("\n2. Please input 5 numbers to display the smallest: ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		
		// create an array with the numbers
		int[] numbers = {num1, num2, num3, num4, num5};
		// we assume that the first number in array (index 0) is the smallest:
		int min = numbers[0];
		// go throw array and compare each number with the smallest value:
		for (int i=1; i<numbers.length; i++)
			// we change the smallest value if other number in array is less than the smallest
			if (numbers[i] < min) {
				min = numbers[i];
			}
		// display the smallest number:
		System.out.println("The smallest number is " + min);
	}
}
