package com.rehman.problems.basics;

public class CountDigits {
    public static void main(String[] args) {

        int number = 1024, digits = 0;

        int temp = number;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        System.out.println("Number " + number + " has " + digits + " digits");

    }
}