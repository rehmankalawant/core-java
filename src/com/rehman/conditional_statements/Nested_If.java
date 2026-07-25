package com.rehman.conditional_statements;

public class Nested_If {
    public static void main(String[] args) {
        int num1 = 50, num2 = 20, num3 = 40;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Maximum number is " + num1);
            } else {
                System.out.println("Maximum number is " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("Maximum number is " + num2);
            } else {
                System.out.println("Maximum number is " + num3);
            }
        }
    }
}