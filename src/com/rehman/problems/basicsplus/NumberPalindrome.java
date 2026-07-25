package com.rehman.problems.basicsplus;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {

        Scanner inputReference = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome or not : ");
        int inputNumber = inputReference.nextInt();

        int reverse = 0, remainder;
        int tempStorage = inputNumber;

//        We are using while() because wee don't know iterations

        while (tempStorage > 0) {

            remainder = tempStorage % 10;

            reverse = reverse * 10 + remainder;

            tempStorage = tempStorage / 10;
        }

        System.out.println("The reverse of number " + inputNumber + " is " + reverse);

//        System.out.println("The Reverse of Number " + inputNumber + " is " + reverse);
//        In this instead of processing on inputNumber directly we assign value from inputNumber --> to tempStorage
//        Because in iteration in while loop at last the input value becomes 0 or less than that
//        And in the end we want that value to compare between result and initial value

        if (inputNumber == reverse) {
            System.out.println("The given number " + inputNumber + " is palindrome");
        } else {
            System.out.println("The given number " + inputNumber + " is not palindrome");
        }

    }
}