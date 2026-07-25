package com.rehman.oops.constructor;

public class ParameterizedConstructor {

//    CONSTRUCTOR
//    A special block of code similar to a method that is automatically invoked when an instance (object) of a class is created

//    There can be multiple constructor in the class
//    We can say that constuctor overloading

//    But there is only one destructor in the class

//    At runtime it will be going to be decided which constructor is going to be called
//    For 1 & 2 we can say that "constructor overloading" & "constructor overriding"

//    1 --> Constructor For String

    ParameterizedConstructor(String name1, String name2) {
        System.out.println("Hello From String Parameterized Constructor");
        System.out.println("name1 = " + name1 + " , name2 = " + name2);
    }

//    2 --> Constructor For Numbers

    ParameterizedConstructor(int number1, int number2) {
        System.out.println("Hello From Number Parameterized Constructor");
        System.out.println("number1 = " + number1 + " , number2 = " + number2);
    }

    //    3 --> Constructor For User Greeting

    String user;

    ParameterizedConstructor(String user) {
//        By using this keyword we can declare the variable once in class and can use multiple time within class
//        As this keyword references to that current object or that local-scoped-method
        this.user = user;
        System.out.println("Hello " + this.user + ", Welcome To Parameterized Constructor ");
    }

    public static void main(String[] Args) {

//        String Constructor
        ParameterizedConstructor nameConstructor = new ParameterizedConstructor("Yash", "Rehman");

        System.out.println("-----------------------------------------------");

//        Number Constructor
        ParameterizedConstructor numberConstructor = new ParameterizedConstructor(10, 20);

//        User Constructor
        ParameterizedConstructor userConstructor = new ParameterizedConstructor("Vikesh");


    }
}