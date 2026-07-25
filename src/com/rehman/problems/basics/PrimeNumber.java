package com.rehman.problems.basics;

public class PrimeNumber {
    public static void main(String[] args) {

        int number = 7, count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("The Number " + number + " Is Prime Number");
        } else {
            System.out.println("The Number " + number + " Is Not Prime Number");
        }
    }
}