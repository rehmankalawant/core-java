package com.rehman.problems.basicsplus;

public class ReverseNumber {
    public static void main(String[] args) {

        int inputNumber = 1234, reverse = 0, remainder;
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
//        And in the end we want that value to show in output line

    }
}