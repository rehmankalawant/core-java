package com.rehman.conditional_statements;

import java.util.Scanner;

public class If_Else {

    public static void main(String[] args) {

        Scanner scannerReference = new Scanner(System.in);

        System.out.println("Enter your age - ");

        int age = scannerReference.nextInt();

        if (age > 17) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");
        }
    }
}