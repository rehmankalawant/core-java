package com.rehman.conditional_statements;

import java.util.Scanner;

public class Else_If {

    public static void main(String[] args) {

        Scanner scannerReference = new Scanner(System.in);

        System.out.println("Enter your percent - ");

        int percent = scannerReference.nextInt();

        if (percent < 35) {
            System.out.println("You are failed in exam");
        } else if (percent > 99) {
            System.out.println("You are passed with first class in exam");
        } else
            System.out.println("You are Extraordinary");
    }
}
