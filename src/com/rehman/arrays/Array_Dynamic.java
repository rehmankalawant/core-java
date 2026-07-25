package com.rehman.arrays;

import java.util.Scanner;

public class Array_Dynamic {
    public static void main(String[] args) {

        Scanner scReference = new Scanner(System.in);

//        ARRAY
//        Array is collection of homogeneous (same) types of data .

//        How to create Array

//        1 --> Take size input from user
        System.out.print("Input of array size - ");

        int size = scReference.nextInt();

//        2 --> Make use of the size in array
//        datatypeOfArrayElements[] nameOfArray = new datatypeOfInput[size]

        int[] array = new int[size];

//        Take Element Input from user using for loop

        for (int arrElementIndex = 0; arrElementIndex < size; arrElementIndex++) {
            System.out.print("Enter element for " + arrElementIndex + " position :");
            array[arrElementIndex] = scReference.nextInt();
        }

//        Output
//        Print array elements

        System.out.print("Array is : [ ");

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("]");

    }
}