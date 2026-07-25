package com.rehman.arrays.problems;

public class Array_SecondMinimumElement {
    public static void main(String[] args) {

        int[] numberArray = {30, 10, 50, 20, 40, 10, 30, 60};

        int max = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (int i = 1; i < numberArray.length; i++) {

            if (numberArray[i] < max) {
                secondMin = max;
                max = numberArray[i];
            } else if (numberArray[i] < secondMin && numberArray[i] != max) {
                secondMin = numberArray[i];
            }

        }

//        Printing the result
        System.out.println("The second minimum number is " + secondMin);


    }
}