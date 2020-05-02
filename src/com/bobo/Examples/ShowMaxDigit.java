package com.bobo.Examples;

/**
 * 3. Display the max digit from a number. Read the number from keyboard
 * @author Bogdan D.
 */

import java.util.Scanner;

public class ShowMaxDigit {

    public ShowMaxDigit() {
        // Input o number that contains multiple digits
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n3. Please input a number to display the max digit: ");
        // declare variable with identifier number of type int and assign the value typed from keyboard
        int number = Math.abs(scanner.nextInt());

        // declare variable with identifier max of type int and assign the minimum value of type integer
        int max = Integer.MIN_VALUE;

        // find the max number:
        while (number > max) {

            // r = the last digit from number, after this statement:
            int r = number%10;

            // change the max value if r > max:
            if (r > max) {
                max = r;
            }
            // after this statement, the number will have a digit less:
            number = number/10;
        }
        // show max digit from number
        System.out.println("The biggest digit is " + max);
    }
}