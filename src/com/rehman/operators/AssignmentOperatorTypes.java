package com.rehman.operators;

public class AssignmentOperatorTypes {

    public static void main(String[] args) {
        int a, b;

//        1 --> Simple Assignment Operator
        a = 10;
        b = 20;

        System.out.println("For Simple Assignment Operator");
        System.out.println("a = " + a + " | " + "b = " + b);

//        2 --> Compound Assignment Operator
        a += b; // a = a + b ;
        b += 5; // b = b + 5 ;

        System.out.println("For Compound Assignment Operator");
        System.out.println("a = " + a + " | " + "b = " + b);

    }
}