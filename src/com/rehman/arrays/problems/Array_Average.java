package com.rehman.arrays.problems;

public class Array_Average {
    public static void main(String[] args) {

        int sum = 0, average;

        int[] numberArray = {30, 10, 50, 20, 40, 10, 30, 60};

        for (int i = 0; i < numberArray.length; i++) {

//            1 --> Calculating Sum

            sum += numberArray[i]; // Also valid as sum = sum + numberArray1[i];

        }

//        2 --> Calculating Average

        average = sum / numberArray.length;

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);


    }
}