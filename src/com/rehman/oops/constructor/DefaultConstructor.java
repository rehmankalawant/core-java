package com.rehman.oops.constructor;

public class DefaultConstructor {

    DefaultConstructor() {
        System.out.println("Hello From Default Constructor");
    }

    public static void main(String[] Args) {

//        Constructor
//        1. Constructor has no return type
//        2. Constructor must have same name as className in which it is declared / initialized
//        3. When you create object --> Constructor get automatically called

        DefaultConstructor newConstructorReference = new DefaultConstructor();

        System.out.println(newConstructorReference);

        // com.rehman.oops.constructor.DefaultConstructor@27716f4
        // Always point to its memory reference address

    }
}