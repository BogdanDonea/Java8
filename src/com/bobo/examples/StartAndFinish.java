package com.bobo.examples;

/**
 * 9. Input 2 values:  start  and  finish, then display the numbers from start to finish
 *
 * @author Bogdan D.
 */

import java.util.Scanner;

public class StartAndFinish {

	public StartAndFinish() {
		
		Scanner scanner = new Scanner(System.in);

		// declare two variables (start and finish) of type int and assign the values entered from keyboard
		System.out.println("\n9. START AND FINISH: Please enter Start number: ");
		int start = scanner.nextInt();
		
		System.out.println("Finish number:");
		int finish = scanner.nextInt();
		
		// if finish is less than start, change the values between them:
		if (finish < start) {
			start = start + finish; 
			finish = start - finish;
			start = start - finish;
		}

		System.out.println("The numbers from " + start + " to " + finish + " are: ");

		// display the numbers from start to finish:
		while (start <= finish) {
			System.out.println(start);
			start++;
		}
	}
}
