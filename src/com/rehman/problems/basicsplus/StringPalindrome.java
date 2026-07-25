package com.rehman.problems.basicsplus;

public class StringPalindrome {
    public static void main(String[] args) {

        String str = "abcdcba", reverseStringOutput = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            char letter = str.charAt(i);

            reverseStringOutput = reverseStringOutput + letter;

        }

        System.out.println("The reverse of string " + str + " is " + reverseStringOutput);

//        if (str == reverseStringOutput) // Not right
//        It always give result as false because java has value_1.equals(value_2) method

        if (str.equals(reverseStringOutput)) {
            System.out.println("The string " + str + " is " + "palindrome");
        } else {
            System.out.println("The string " + str + " is " + "not palindrome");
        }

    }
}