package com.rehman.operators;

public class LogicalOperators {
    public static void main(String[] args) {

//        Logical Operator
//        Logical operators are used to combine or modify boolean expressions
//        They are commonly used in if statements, loops, and conditional expressions.
//        When we want result between two or more relational-operators

//        Types of Logical Operator
//        1. AND --> &&
//        2. OR  --> ||
//        3. NOT --> !

        int a = 10, b = 20;

//        1. AND --> &&
//        Both TRUE then TRUE either FALSE
//        If any one FALSE then FALSE

        System.out.println("AND OPERATOR");
        System.out.println((a > b) && (a > b));
        System.out.println((a < b) && (a < b));
        System.out.println((a > b) && (a < b));
        System.out.println();

//        2. OR --> ||
//        Both False then TRUE either FALSE
//        If any one TRUE then TRUE

        System.out.println("OR OPERATOR");
        System.out.println((a < b) || (a < b));
        System.out.println((a > b) || (a < b));
        System.out.println((a < b) || (a < b));
        System.out.println();

//        3. NOT --> !
//       // Reverse the result

        System.out.println("NOT OPERATOR");
        System.out.println(!(a > b));
        System.out.println(!(a < b));
    }
}