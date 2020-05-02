package com.bobo.examples;

/**
 * This is the main method. From here you can run all the methods written in other classes.
 */

public class Main {
    public static void main(String[] args) {

        // 1. Calculate the sum of the first 100 numbers higher than 0
        new SumOfFirstNumbers();

        // 2. Display the smallest number from a collections of number
        new SmallestNumber();

        // 3. Display the max digit from a number. Read the number from keyboard
        new ShowMaxDigit();

        // 4. Check if a number is palindrom( e.g palindrom 1221, 34143)
        new Palindrom();

        // 5. Display all the prime numbers lower than a given number
        new PrimeNumbers();

        // 6. Input the dimensions of a rectangle and display area and perimeter
        new Rectangle();

        // 7. Input the length of the side of a square, and display its area.
        // Produce an error message if the length is negative
        new Square();

        // 8. Input 3 numbers, and display the biggest.
        new BiggestNumber();

        // 9. Input 2 values:  start  and  finish, then display the numbers from start to finish
        new StartAndFinish();

        // 10. Read number n and print the first n numbers in Fibonacci sequence.
        //  The Fibonacci sequence (1,1,2,3,5,8,13,�) begins with two 1�s,
        //  and each successive numbers is the sum of the preceding two numbers
        //  (e.g. 13 = 5+8)
        new FibonacciNumbers();

        // 11. Write pseudo code that will perform the following.
        //   a) Read in 5 separate numbers.
        //   b) Calculate the average of the five numbers.
        //   c) Find the smallest (minimum) and largest (maximum) of the five entered numbers.
        //   d) Write out the results found from steps b and c with a message describing what they are
        new AverageMinMax();
    }
}
