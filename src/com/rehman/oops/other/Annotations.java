package com.rehman.oops.other;

// Annotations
// A form of syntactic metadata that provides additional information about a program without directly affecting its core execution logic

//  Informing the compiler about expected behavior to catch errors early.

class A {
    public void showTheMethodsFromClass() {
        System.out.println("show from A");
    }
}

public class Annotations extends A {

//    Suppose we're done syntactical mistake with methodName
//    like showTheMethodFromClass and showTheMethodsFromClass

//    When we call the method , the compiler will execute from Parent not from child
//    Because of the spell mistake


    @Override
    public void showTheMethodsFromClass() {
        super.showTheMethodsFromClass();
    }

//    ERROR if method name is like showTheMethodFromClass

//    There are various type of annotations present
//    Class Level
//    Method Level
//    Variable Level

}
