package org.perscholas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Here is a program that checks whether your number is:
	    divisible by 2 AND 3
	    divisible by 2 OR 3
	    divisible by 2 OR 3 but NOT BOTH
	 */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in any number: ");
        int number = input.nextInt();
        System.out.println("Is you number '" + number + "' divisible by 2 and 3? " +
                ((number % 2 == 0) && (number % 3 == 0)));
        System.out.println("Is your number '" + number + "' divisible by 2 or 3? " +
                ((number % 2 == 0) || (number % 3 == 0)));
        System.out.println("Is your number '" + number +
                "' divisible by 2 or 3, but not both? " +
                ((number % 2 == 0) ^ (number % 3 == 0)));
    }
}
