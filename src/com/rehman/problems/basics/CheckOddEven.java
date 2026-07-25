package com.rehman.problems.basics;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {

        Scanner inputReference = new Scanner(System.in);

        System.out.print("Enter the number to check odd/even : ");
        int number = inputReference.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is Even");
        }
        else{
            System.out.println("The number " + number + " is Odd");
        }

    }
}