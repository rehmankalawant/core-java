package com.rehman.arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

//        TYPES OF ARRAY

//        2 --> Two Dimensional Array
//        - Array Inside array present
//        - Stores data in rows and columns (matrix form).
//        - int[][] twoDimensionalArrayName = new int[mainArraySize][internalArraySize]

        int[][] twoDimensionalArray = new int[3][4];

//        twoDimensionalArray = [ [5,2,1,4] , [7,3,9,8] , [9,6,4,1] ] ;

//        Access Elements From 2D Array ---> twoDimensionalArray[row][column]

/*          0 1 2 3 --> j(column)
       0  | 5 2 1 4 |
       1  | 7 3 9 8 |
       2  | 9 6 4 1 |
       ↓
       i(row)

//       Row 1
       5 --> twoDimensionalArray[0][0] ,
       2 --> twoDimensionalArray[0][1] ,
       1 --> twoDimensionalArray[0][2] ,
       4 --> twoDimensionalArray[0][3] ,

//       Row 2
       7 --> twoDimensionalArray[1][0] ,
       3 --> twoDimensionalArray[1][2] ,
       9 --> twoDimensionalArray[1][3] ,
       8 --> twoDimensionalArray[1][4] ,

//       Row 3
       9 --> twoDimensionalArray[2][0] ,
       6 --> twoDimensionalArray[2][1] ,
       4 --> twoDimensionalArray[2][2] ,
       1 --> twoDimensionalArray[2][3] ,

 */

//        matrix = [[1, 2], [3, 4]];
        int[][] matrix = {{1, 2}, {3, 4}};

    }
}