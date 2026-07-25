package com.rehman.strings;

public class Strings {
    public static void main(String[] args) {

//        String is collection of characters

//       For string always store in double quotes "stringValue"
//       For character always store in single quotes "characterValue"

        String name = "Rehman";

        String name2 = new String("Yash");

//        By both methods the string-constructor create a memory for them

        System.out.println(name);
        System.out.println(name2);

//        Hashcode
        System.out.println(name.hashCode());
    }
}