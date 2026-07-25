package com.rehman.problems.basics;

public class PowerOfNumber {
    public static void main(String[] args) {

        int base = 2, power = 4, result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * base;
        }

        System.out.println("The result of base " + base + " to the power " + power + " is " + result);

        double resultWithInbuiltMethod = Math.pow(base, power);

        System.out.println("The result of base " + base + " to the power " + power + " with inbuilt method is " + result);

    }
}