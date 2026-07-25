package com.rehman.oops.exception_handling;

class A {
    //    Here we are throwing the exception at method level

//    Throws says
//    I will throw the error at method-level or class-level
//    But you have to catch it somewhere
//    Maybe in another class or in main method

    public void checkClass() throws ClassNotFoundException {
        Class.forName("Rehman");
    }
}

public class Throws {

//    We can also attach throws to main method
//    But we are telling the jvm if exception occur handle it by yourself
//    So jvm directly stops the execution

    public static void main(String[] args) {

        A ref = new A();

        try {
            ref.checkClass();
        } catch (ClassNotFoundException err) {
            System.out.println("Class not found " + err);
        }


    }
}
