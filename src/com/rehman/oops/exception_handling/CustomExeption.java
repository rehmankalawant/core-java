package com.rehman.oops.exception_handling;

//  We can create custom exception by extending it by our own class

class RehmanException extends Exception {
    public RehmanException(String message) {

//        We are calling the parent-constuctor who is having the constructor with string parameter
//        And that construcor is supposed to print the error in console
//        And we are handing the string message to Exception-Class_Constructor to print message
        super(message);
    }
}

public class CustomExeption {

    public static void main(String[] args) {

        try {
            int division = 0 / 10;

            if (division == 0) {
                throw new RehmanException("This is custom exception message by Rehman");
            }

            System.out.println(division);
        } catch (RehmanException err) {
            System.out.println("Exception is " + err);
        }

        System.out.println("Outside the try-catch block");

    }
}
