package com.rehman.operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

//        Also valid
//        int a = 10 , b = 4 ;

        int addition = a + b;
        int substraction = a - b;
        int multiply = a * b;
        int division = a / b;
        int modulus = a % b;

        System.out.println("Addition is " + addition);
        System.out.println("Substraction is " + substraction);
        System.out.println("Multiply is " + multiply);
        System.out.println("Division is " + division);
        System.out.println("Modulus is " + modulus);
    }
}