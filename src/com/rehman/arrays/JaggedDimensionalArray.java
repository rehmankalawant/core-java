package com.rehman.arrays;

import java.util.Arrays;

public class JaggedDimensionalArray {
    public static void main(String[] args) {

//        TYPES OF ARRAY

//        4 --> Jagged Array
//        A 2D array where each row can have different lengths.

//        Here int[3][] - second is array is empty because we don't know the size of internal array
//        And it can be anything

        int[][] jaggedArrayName = new int[3][];

        int[][] jagged = {{1, 2}, {3, 4, 5}, {6}};

        System.out.println(Arrays.deepToString(jagged));

    }
}