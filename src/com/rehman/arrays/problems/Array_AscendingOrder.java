package com.rehman.arrays.problems;

import java.util.Arrays;

public class Array_AscendingOrder {
    public static void main(String[] args) {

//        1 --> By using for loop

        int[] numberArray1 = {30, 10, 50, 20, 40};

        for (int i = 0; i <= numberArray1.length - 1; i++) {
            for (int j = i + 1; j <= numberArray1.length - 1; j++) {
                if (numberArray1[i] > numberArray1[j]) {
                    int temp = numberArray1[i];
                    numberArray1[i] = numberArray1[j];
                    numberArray1[j] = temp;
                }
            }
        }

//        Printing the array
        System.out.println(Arrays.toString(numberArray1));


//        2 --> By using inbuilt method

        int[] numberArray2 = {80, 60, 100, 70, 90};

        Arrays.sort(numberArray2);

//        Printing the array
        System.out.println(Arrays.toString(numberArray2));

    }
}