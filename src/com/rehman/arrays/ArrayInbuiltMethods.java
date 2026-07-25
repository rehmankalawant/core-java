package com.rehman.arrays;

import java.util.Arrays;

public class ArrayInbuiltMethods {
    public static void main(String[] args) {

//        ARRAY METHODS

//        1 --> toString(array)
//        Used to access the element from a simple integer array / one-dimensional integer array

        int[] integerArray = {10, 20, 30, 40};

        System.out.println("toString() --> " + Arrays.toString(integerArray));


//        2 --> deepToString(array)
//        Used to access the element from two-dimensional array

        int[][] twoDimArray = {{10, 20}, {11, 22}, {12, 24}, {13, 26}};

        System.out.println("deepToString() --> " + Arrays.deepToString(twoDimArray));


//        3 --> asList(array)
//        Used to access the element from a simple string array / one-dimensional string array

        String[] stringArray = {"Yash", "Rehman", "Vikesh", "Arman"};

        System.out.println("toString() --> " + Arrays.toString(stringArray));
        System.out.println("asList() --> " + Arrays.asList(stringArray));

//        4 --> sort(array)
//        Used to sort array element in ascending order

        int[] unsortedArray = {30, 50, 10, 20, 40};

        Arrays.sort(unsortedArray);

        System.out.println("sort() --> " + Arrays.toString(unsortedArray));

//        5 --> copyOf(sourceArray, lengthOfTargetArray )
//        Used to copy array from a source array | One array to another array
//         Arrays.copyOf(sourceArray, lengthOfTargetArray);

        int[] sourceArray = {30, 50, 10, 20, 40};

        int[] targetArray = Arrays.copyOf(sourceArray, 10);

//        If size of target array is more it gets filled with element zero until get replaced with another element .

//        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        System.out.println("copyOf() --> " + Arrays.toString(targetArray));


//        6 --> equals( arr1 , arr2 )

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5,6};

        boolean result_12 = Arrays.equals(arr1,arr2);
        boolean result_13 = Arrays.equals(arr1,arr3);

        System.out.println("Array 1 is equals to Array 2 : " + result_12);
        System.out.println("Array 1 is equals to Array 3 : " + result_13);




    }
}