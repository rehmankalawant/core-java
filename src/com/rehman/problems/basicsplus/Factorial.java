package com.rehman.problems.basicsplus;

public class Factorial {
    public static void main(String[] args) {

        int number = 5, resultFactorial = 1;

        for (int i = number; i > 0; i--) {

            resultFactorial = resultFactorial * i;

        }

        System.out.println("The factorial of " + number + " is " + resultFactorial);

    }
}