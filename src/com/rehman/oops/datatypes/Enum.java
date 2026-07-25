package com.rehman.oops.datatypes;

//  Enum - class
//  Enum is a special data type used to define a fixed set of predefined constants.
//  Enum is a class, but we cannot extend it
//  Enum java , if there is ___able , it is an enum/fixed-constants

enum Status {
    //    We can declare fixed constants with type safety
    //    By default static
    //    So that we can access them directly with ClassName
    //    Array of constants

    Running, Pending, Failed, Success

//    these states also have numbering which starts from 0 ,
//    Here
//    Running ---> 0
//    Pending ---> 1
//    Failed ---> 2
//    Success ---> 3
}

public class Enum {

    public static void main(String[] args) {

//        instead of declaring the constants for everywhere the enum helps us to reduce the redundancy
//        And also they are typesafe we can change once at the enum-class to avoid any future failure

        Status process = Status.Running;

//        datatype variable = ClassName.state

//        After finishing the process we can put that process variable as success
//        Like this ,

//        process = Status.Success;

        System.out.println(process);

//        we can access the number using ordinal() method
        System.out.println(process.ordinal());

//        ! important
//        That's why we said Enum is a class because it has methods


    }
}
