package com.rehman.type_casting;

public class WideningTypeCasting {
    public static void main(String[] Args) {

//        TYPE CASTING
//        Type conversion from one type to another

//        1
//        Widening Type Casting
//        Automatic Type Casting
//        Implicit Type Casting
//        Storing small datatype into large datatype
//        System do it by himself

        int number = 13;
        char ch = 'A';

        double typeCastedNumber = number;
        int ascii = ch;

        System.out.println("TypeCasted Number = " + typeCastedNumber);
        System.out.println("Ascii Character = " + ascii);
    }
}