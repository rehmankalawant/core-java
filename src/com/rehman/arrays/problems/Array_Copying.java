package com.rehman.arrays.problems;

import java.util.Arrays;

public class Array_Copying {
    public static void main(String[] args) {

        int[] sourceArray = {10, 20, 30, 40, 50};

//        1 --> Create an empty target array

        int[] targetArray = new int[10];

//        2 --> Assign element from source to target array

        for (int i = 0; i < sourceArray.length; i++) {

            targetArray[i] = sourceArray[i];

        }

//        3 --> Print the target array

        System.out.println("Copied array is " + Arrays.toString(targetArray));

    }
}