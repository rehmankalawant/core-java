package com.rehman.oops.basics.four_pillars;

// PARENT CLASS

class Parent {

    static int age = 100;

    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int substraction(int num1, int num2) {
        return num1 + num2;
    }
}

// CHILD CLASS

// 1
// So our parent has two methods, and we want that also, but we want to create our own methods too.
// So we extend our parent with this child class using | extends keyword along with Parent_className |

public class Inheritance extends Parent {

//    2
//    We can define our own methods

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {
        return num1 / num2;
    }


    public static void main(String[] args) {

        Inheritance referenceVariable = new Inheritance();

//        Inheritance
//        Allowing one class (child) to access the properties (fields) and behaviors (methods) of another class (parent)

//        Example :
//        My Property is mine + What my parent property is also mine

//        Parent-class ---> Child-class
//        Super-class ---> Sub-class
//        Base-class ---> Derived-class

//        The methods and variables from parent_class acts like they are in this child_class

        System.out.println("Calling variable -" + Inheritance.age);

        System.out.println("number1 = 10 , number2 = 5");

        System.out.println("Addition is = " + referenceVariable.addition(10, 5));
        System.out.println("Substraction is = " + referenceVariable.multiply(10, 5));
        System.out.println("Multiplication is = " + referenceVariable.multiply(10, 5));
        System.out.println("Division is = " + referenceVariable.division(10, 5));


    }
}


// MULTI LEVEL INHERITANCE

// Suppose we want again some functionality + the functionality child have

// So we can extend the child with another child
// i.e. making the child as parent and extending it with our functionality and methods too.

// So here a hierarchy occurs of extending methods
// i.e. called as multi-level-inheritance


// ! Important

// 1
// Java does not support Multiple Inheritance
// Cause if one method exist in both the parent which it will call at execution
// So java removed the feature

// 2
// Java does not support Cyclic Inheritance
// A extends B , B extends C , and C extends A