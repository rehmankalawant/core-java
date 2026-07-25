package com.rehman.oops.basics;

class Parent {
    public void show() {
        System.out.println("Hello From Parent Class");
    }
}


// Child Class

public class MethodOverriding extends Parent {

//    Method OverRiding

//    Method Overriding occurs when a child-class provides its own implementation of a method already defined in the parent class

//    Child class written same method which parent have , and decided to not use that method

    public void show() {
        System.out.println("Hello From Child Class - Overriding the parent method");
    }

    public static void main(String[] args) {

        MethodOverriding referenceVariable = new MethodOverriding();

//        So when we call the show method it picks up from the child instead of parent

        referenceVariable.show();

    }


}