package com.rehman.arrays.problems;

public class Array_SecondMaximumElement {
    public static void main(String[] args) {

        int[] numberArray = {30, 10, 50, 20, 40, 10, 30, 60};

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < numberArray.length; i++) {

            if (numberArray[i] > max) {
                secondMax = max;
                max = numberArray[i];
            } else if (numberArray[i] > secondMax && numberArray[i] != max) {
                secondMax = numberArray[i];
            }

        }

//        Printing the result
        System.out.println("The second maximum number is " + secondMax);


    }
}