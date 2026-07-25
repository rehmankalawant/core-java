package com.rehman.oops.special_keywords;

// THIS -
// This method calls / executes the constructor of the same class
// It also checks the argument type and calls self-class-constructor

class D {

    //    Default Constructor

    public D() {

//        5
//        This realizes that there no more this() method
//        So it execute this first and then its child-constructor

        System.out.println("Inside Default Constructor - B");
    }


    //    Parameterized int Constructor

    public D(int num1) {

//        4
//        This realizes that there is also a this() method which points towards a default constructor
//        So stop execution for below it and look for the default constructor
//        Once it get it start execute that constructor first

        this();
        System.out.println("Inside Parameterized Constructor - B - " + num1);
    }


//    Parameterized boolean Constructor

    public D(boolean booleanValue) {

//        3
//        This realizes that there is also a this() method which points towards an integer parameter constructor
//        So stop execution for below it and look for the constructor with integer-parameter-constructor
//        Once it get it start execute that constructor first

        this(100);
        System.out.println("Inside Parameterized Constructor - B - " + booleanValue);
    }


//    Parameterized String Constructor

    public D(String str) {

//        2
//        This realizes that there is a this() method
//        So stop execution for below it and look for the constructor with boolean-parameter-constructor
//        Once it get it start execute that constructor first

        this(true);
        System.out.println("Inside Parameterized Constructor - B - " + str);
    }

}

public class This_Method {

    public static void main(String[] args) {

        D ref = new D("Rehman");

//        So what's happening here

//        1
//        We are calling the parameterized string constructor of D

    }
}