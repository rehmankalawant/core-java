package com.rehman.oops.basics.four_pillars;

// POLYMORPHISM
// Poly + Morph --> Many + Behavior ( Many + Forms)

// 2 Types

// Compile-time --> (Method Overloading)
// When you compile file using `javac FileName.java` and you know what things are going to be executed


// Runtime --> (Method Overriding)
// Which methods will be executed will be decided on runtime


public class Polymorphism {

//    1
//    Method Overloading

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    public static int addition(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static void main(String[] args) {

        System.out.println("With 2 numbers (return int) = " + Polymorphism.addition(10, 20));
        System.out.println("With 3 numbers (return int) = " + Polymorphism.addition(20, 30, 50));


//        2
//        For Method Overriding refer the below file
//        package com.rehman.oops.basics.MethodOverriding;

    }
}