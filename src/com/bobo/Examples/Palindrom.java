package com.bobo.Examples;

/**
 * 4. Check if a number is palindrom( e.g palindrom 1221, 34143)
 * @author Bogdan D.
 */

import java.util.Scanner;

public class Palindrom {

    public Palindrom() {
		
        System.out.println("\n4. Insert a number to check if it is palindrom: ");
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(scanner.nextInt());

        int r, sum = 0, temp = number;

        while (number > 0) {
            r = number%10;  // r = the rest of number modulo 10
            sum = (sum * 10) + r; // if it's palindrome the sum will have the exact value of the number, after the loop
            number = number / 10; // exclude the last digit from number after each iteration
        }

        // display result:
        if (temp == sum) {
            System.out.println("The number " + temp + " is palindrom!");
        } else {
            System.out.println("The number " + temp + "  is not palindrom!");
        }
    }
}
