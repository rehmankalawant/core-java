package com.rehman.problems.basicsplus;

public class Fibonacci {
    public static void main(String[] args) {

        int position = 6, first = 0, second = 1, next;

        System.out.print("Fibonacci series is : ");

        for (int i = 0; i <= position; i++) {
            System.out.print(first + " --> ");
            next = first + second;
            first = second;
            second = next;
        }

    }
}