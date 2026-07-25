package com.rehman.strings;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Rehman";

//        1
//        charAt(index)
//        Return the character at given position
        System.out.println("charAt method - " + name.charAt(0)); // R

//        2
//        length()
//        Return length of the string
        System.out.println("length method - " + name.length()); // 6

//        3
//        isEmpty()
//        Return boolean value by checking string is empty or not
//        Returns true if the string length is 0
        System.out.println("isEmpty method - " + name.isEmpty()); // false

//        4
//        isBlank()
//        Returns true if the string is empty or contains only whitespace characters
        System.out.println("isBlank method - " + name.isBlank()); // false

//        5
//        startsWith()
//        Checks if the string begins with the specified prefix
        System.out.println("startsWith method - " + name.startsWith("s")); // false

//        6
//        endsWith()
//        Checks if the string ends with the specified
        System.out.println("endsWith method - " + name.endsWith("r")); // false

//        7
//        toLowerCase()
//        Return the lowercase string
        System.out.println("toLowerCase method - " + name.toLowerCase()); // rehman

//        8
//        toUpperCase()
//        Return the uppercase string
        System.out.println("toUpperCase method - " + name.toUpperCase()); // REHMAN

//        9
//        concat(str)
//        Append the string with given string
        System.out.println("concat method - " + name.concat("Kalawant")); // RehmanKalawant

//        10
//        equalsIgnoreCase(str)
//        Compares content while ignoring case differences
        System.out.println("equalsIgnoreCase method - " + name.equalsIgnoreCase("ReHmaN")); // true

//        11
//        compareTo(str)
//        Compares two strings lexicographically (alphabetically) and returns an integer
        System.out.println("compareTo method - " + name.compareTo("ReHmaN")); // 32

//        12
//        indexOf(str)
//        Returns the index of the first occurrence of the specified substring, or -1 if not found
        System.out.println("indexOf method - " + name.indexOf("m")); // 3

//        13
//        toCharArray()
//        Break a String down into a primitive char array
        char[] array = name.toCharArray();
        System.out.println("toCharArray method - ");
        for (char i : array) {
            System.out.print(i + " "); // [ 'R' ,'e' ,'h' ,'m' ,'a' ,'n' ]
        }
        System.out.println();

//        14
//        substring()
//        Give part of string
        System.out.println("Substring (with-start-index) " + name.substring(3)); // man
//
//        Exclude the end index
        System.out.println("Substring (with-start-end-index) " + name.substring(0, 2)); // Re


//        15
//        valueOf()
//        Convert other data types into a String
        int year = 2026;
        boolean isActive = true;
        String yearStr = String.valueOf(year);
        String statusStr = String.valueOf(isActive);

        System.out.println("valueOf method - " + "valueOf (int): " + yearStr); // "2026"
        System.out.println("valueOf method - " + "valueOf (boolean): " + statusStr); // "true"

//        16
//        String.join()
//        Combine multiple strings with a separator
        String day = "12";
        String month = "07";
        String currentYear = "2026";

        // Joins the elements using "/" as the delimiter
        String dateStr = String.join("/", day, month, currentYear);

        System.out.println("join method - " + dateStr);  // "12/07/2026"

    }
}