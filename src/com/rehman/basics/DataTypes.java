package com.rehman.basics;

import java.util.ArrayList;

public class DataTypes {

    public static void main(String[] Args) {

//        DATATYPES
//        Data types are type of data

//        1 --> byte --> 1 byte --> -128 to 127
        byte b = 100;


//        2 --> short --> 2 bytes --> -32,768 to 32,767
        short s = 20000;


//        3 --> int --> 4 bytes --> -2³¹ to 2³¹ - 1 --> -2,147,483,648 to 2,147,483,647
        int i = 100000;


//        4 --> long --> 8 bytes --> -2⁶³ to 2⁶³ - 1
        long l = 15000000000L;


//        5 --> float --> 4 bytes --> Approximately 6–7 decimal digits
        float f = 5.75f;


//        6 --> double --> 8 bytes --> Approximately 15–16 decimal digits
        double d = 19.99;


//        7 --> char --> 2 bytes --> Unicode characters (0 to 65,535)
        char ch = 'R';


//        8 --> boolean --> JVM depends bytes --> true or false
        boolean flag = true;


//        NEW UPDATE
//        9 ---> var ---> only applicable for local-variables
//        instance-variable-are-stored but local-variable-present-inside-method-are-only-for-processing-not-for-storing
//        Compiler tells the datatype at compiling-time
//        that this var-is-int, var-is-string
//        Cannot just declare , initialization is must

        var number = 10;
        var string = "Rehman";
        var obj = new ArrayList<>();
        var numArray = new int[10];
        var referenceType = new DataTypes();
    }
}