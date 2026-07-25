package com.rehman.arrays.problems;

public class Array_MaximumElement {
    public static void main(String[] args) {

        int[] numberArray = {30, 10, 50, 20, 40, 10, 30, 60};

        int max = numberArray[0];

        for (int i = 1; i < numberArray.length; i++) {

            if (numberArray[i] > max) {
                max = numberArray[i];
            }

        }


        System.out.println("The maximum number is " + max);


    }
}