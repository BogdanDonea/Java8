package com.bobo.Examples;

/**
 * 5. Display all the prime numbers lower than a given number
 * @author Bogdan D.
 */

import java.util.Scanner;

public class PrimeNumbers {

	public PrimeNumbers() {
		// input a number from keyboard
		Scanner digit = new Scanner(System.in);
		System.out.println("\n5. Enter a number here to show all the prime numbers lower than your number: ");
		
		// declare a variable number of type int and assign the value of the number from keyboard minus 1
		// because we want to show the prime numbers less than the number
		int number = digit.nextInt()-1;
		
		// error message if the number entered is less than 2
		if (number+1 < 2) {
			System.out.println("There are no prime numbers lower than "+ (number+1));
		} else {
			// if number is bigger than 2 check and display the smallest prime numbers:
			System.out.println("The prime numbers lower than " + (number+1) + " are: ");
			while ((number+1)>2) {
				int i = 2;
				boolean prime = true;
				// check if the number is prime or not:
				while (prime && number%i != 0) {
					if (i<number-1){
						i++;
					} else {
						// here the number is prime and will display it
						System.out.println(number);
						prime = false;
					}
				}
				number--;
			}
			// display number 2 because it's the only exception from the rule above
			System.out.println("2");
		}
	}
}
