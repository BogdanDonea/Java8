package com.bobo.Examples;

/**
 * 10. Read number n and print the first n numbers in Fibonacci sequence.
 *   The Fibonacci sequence (1,1,2,3,5,8,13,�) begins with two 1�s,
 *   and each successive numbers is the sum of the preceding two numbers
 *   (e.g. 13 = 5+8)
 *
 *   @author Bogdan D.
 */

import java.util.Scanner;

public class FibonacciNumbers {

	public FibonacciNumbers() {
		// read 'n' from keyboard
		Scanner input = new Scanner(System.in);
		System.out.println("\n10. Enter number n to show first n numbers in Fibonacci sequence ");
		int n = input.nextInt();

		int f1=1;
		int f2=1;
		int f3;

		// if n <= 0, there are no numbers in Fibonacci sequence to show
		if(n<=0){
			System.out.println("There are no numbers to show from Fibonacci sequence");
		}
		// display first n numbers in Fibonacci sequence keeping in mind that f3 = f1 + f2:
		else if(n==1){
			System.out.println(n+" ");
		}
		else {
			System.out.print(f1 + " " + f2 + " ");
			for(int i=3; i<=n; i++){
				f3=f1+f2;
				System.out.print(f3+" ");
				f1=f2;
				f2=f3;
			}			
		}
	}
}
