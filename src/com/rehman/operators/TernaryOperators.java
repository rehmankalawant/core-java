package com.rehman.operators;

public class TernaryOperators {
    public static void main(String[] args) {

//        Ternary Operator
//        Ternary operators are used to check condition and show result in one row .
//        shorthand way of writing an if-else statement

        int num1 = 20, num2 = 10, num3 = 30;

//        1 --> Simple Ternary

        int maximumNumber = (num1 > num2) ? num1 : num2;

        System.out.println("Simple - Maximum number is " + maximumNumber);

//        2 --> Advanced Ternary
//        - If number 1 is greater than compare it with number 3 and show result between 1 & 3
//        - If number 2 is greater than compare it with number 3 and show result between 2 & 3

        int maxNumber = (num1 > num2) ? (num1 > num3) ? num1 : num3 : (num2 > num3) ? num2 : num3;

        System.out.println("Advanced - Maximum number is " + maxNumber);

    }
}