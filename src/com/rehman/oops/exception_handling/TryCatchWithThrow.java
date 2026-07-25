package com.rehman.oops.exception_handling;

public class TryCatchWithThrow {

    public static void main(String[] args) {

        try {
            int division = 0 / 10;

            if (division == 0) {
//                We can actually create an exception based on a condition by using `throw` keyword

//                As we know ArithmeticException is class , and we can create an object of class
//                And since we throw , the catch-block will catch it
                throw new ArithmeticException("Don't divide the zero");
            }

            System.out.println(division);
        } catch (Exception err) {
            System.out.println("Exception is " + err);
        }

        System.out.println("Outside the try-catch block");

    }
}
