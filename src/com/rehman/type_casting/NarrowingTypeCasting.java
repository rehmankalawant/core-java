package com.rehman.type_casting;

public class NarrowingTypeCasting {
    public static void main(String[] Args) {

//        TYPE CASTING
//        Type conversion from one type to another

//        2
//        Narrowing Type Casting
//        Manual Type Casting
//        Explicit Type Casting
//        Storing large datatype into small datatype
//        We manually have to do this
//        Data may lose sometimes

        double number = 11.67;
        int typeCastedNumber = (int) number;

//        double ---> int
//        8 bytes ---> 4 bytes
//        (int) is in what you want to convert the number

        System.out.println("TypeCasted Number = " + typeCastedNumber);

//        Here .67 is truncated
//        The data loss happens

    }
}