package com.rehman.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

//        TYPES OF ARRAY

//        3 --> Multi Dimensional Array
//        Arrays with more than two dimensions.

        int[][][] cube = new int[2][3][2];

        int[][][] array = {
//                Main Array Size = 2 Elements
//                1
                { // Layer 1 Size = 3 Elements
                        {3, 1}, // Row 0 = 2 Elements
                        {2, 6}, // Row 1 = 2 Elements
                        {8, 5}  // Row 2 = 2 Elements
                },
//                2
                { // Layer1 Size = 3 Elements
                        {2, 9}, // Row 0 = 2 Elements
                        {7, 4}, // Row 1 = 2 Elements
                        {1, 8}  // Row 2 = 2 Elements
                }
        };

        System.out.println(Arrays.deepToString(array));

    }
}