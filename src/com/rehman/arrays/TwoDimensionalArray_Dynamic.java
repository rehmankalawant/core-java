package com.rehman.arrays;

public class TwoDimensionalArray_Dynamic {
    public static void main(String[] args) {

//        1 --> Initialization of array
        int mainArraySize = 5, internalArraySize = 4;

        int[][] twoDimensionalArray = new int[mainArraySize][internalArraySize];

//        2 --> Filling values with for-loop

        for (int row = 0; row < mainArraySize; row++) {
            for (int column = 0; column < internalArraySize; column++) {
                twoDimensionalArray[row][column] = (int) (Math.random() * 10);

//                print to see array
//                System.out.print(twoDimensionalArray[row][column] + " ");

            }
//            For next row
//            System.out.println();

        }

//        3 --> Accessing 2D array
//        normal array --> int num : array
//        dimensional array --> int num[] : dimensionalArray
//        dimensional array --> int[] num : dimensionalArray --- also valid

//        Because in normal we access number on an index , Like [ 1,2,3,4,5]
//        But in Dimensional we access an array on an index , Like [ [1,2] , [3,4] , [5,6] ]

        for (int numArr[] : twoDimensionalArray) {
            for (int num : numArr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}