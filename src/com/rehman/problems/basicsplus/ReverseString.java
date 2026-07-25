package com.rehman.problems.basicsplus;

public class ReverseString {
    public static void main(String[] args) {

        String name = "rehman", reverseStringOutput = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            char letter = name.charAt(i);

            reverseStringOutput = reverseStringOutput + letter;

        }

        System.out.println("The reverse of string " + name + " is " + reverseStringOutput);

    }
}