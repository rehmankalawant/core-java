package com.rehman.conditional_statements;

import java.util.Scanner;

public class Switch_Case_Advanced {

    public static void main(String[] args) {

        Scanner scReference = new Scanner(System.in);

        System.out.println("Enter the day : Sunday | Monday | Tuesday | Wednesday | Thursday | Friday | Saturday");

        String day = scReference.nextLine();


        switch (day) {
            case "Sunday", "Saturday" -> System.out.println("It's Holiday");
            case "Monday", "Tuesday", "Wednesday", "Thursday" -> System.out.println("It's Working Day");
            case "Friday" -> System.out.println("No Work Day");
            default -> System.out.println("Enter a valid Day");
        }

    }
}