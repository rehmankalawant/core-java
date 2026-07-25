package com.rehman.operators;

public class BitwiseOperators {
    public static void main(String[] args) {

//        Bitwise Operator
//        Bitwise operators are operators that work directly on the binary representation (bits) of integer data types

//        Types of Bitwise Operator
//        1. AND
//        2. OR
//        3. XOR
//        4. NOT
//        5. LEFT SHIFT
//        6. SIGNED RIGHT SHIFT
//        7. UNSIGNED RIGHT SHIFT

        int a = 6, b = 7;

        System.out.println("AND = " + (a & b));
        System.out.println("OR = " + (a | b));
        System.out.println("XOR = " + (a ^ b));
        System.out.println("NOT = " + (~a));
    }
}