package com.rehman.problems.basics;

import java.util.Scanner;

public class CheckDivisibility {
    public static void main(String[] args) {

        Scanner inputReference = new Scanner(System.in);

        System.out.print("Enter the dividend : ");
        int dividend = inputReference.nextInt();

        inputReference.nextLine();

        System.out.print("Enter the divisor : ");
        int divisor = inputReference.nextInt();

        if (dividend % divisor == 0) {
            System.out.println("The number " + dividend + " is totally divisible by " + divisor);
        }
        else{
            System.out.println("The number " + dividend + " is not totally divisible by " + divisor);
        }

    }
}