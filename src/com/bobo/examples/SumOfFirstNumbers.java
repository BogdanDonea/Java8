package com.bobo.examples;

/**
 *  1. Calculate the sum of the first 100 numbers higher than 0
 * @author Bogdan D.
 */

public class SumOfFirstNumbers {

	public SumOfFirstNumbers() {

		// The first statement declares one variable with the identifier sum to be of type int (integer) which
		// we assign the value zero.

		int sum = 0;
		// Calculate the sum of the first 100 numbers higher than 0 using for loop:
		for (int n=1; n<=100; n++){
			sum = sum + n;
		}
		// display the result:
		System.out.println("1. The sum of numbers between 1-100 is: " + sum);
	}
}
