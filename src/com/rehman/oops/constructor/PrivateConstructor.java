package com.rehman.oops.constructor;

public class PrivateConstructor {

//    Private Constructor
//    A Private Constructor in Java is used to restrict the creation of class instances (objects) from outside the class boundaries

    private PrivateConstructor() {
        System.out.println("Hello From private Constructor");
    }

    public static void main(String[] Args) {

//        We can create the instance of the private constuctor within this class only
//        Else outside this class the creation of object and use of it restricted

        PrivateConstructor newPrivateConstructorReference = new PrivateConstructor();

    }
}

class PrivateConstructor_TestingRestriction {

    public static void main(String[] Args) {

//        We can create the instance of the private constuctor within the class only
//        Else outside the class the creation of object and use of it restricted

//        PrivateConstructor checkingTheRestriction = new PrivateConstructor(); // ERROR

//        'PrivateConstructor()' has private access in 'com.rehman.oops.constructor.PrivateConstructor'

    }
}