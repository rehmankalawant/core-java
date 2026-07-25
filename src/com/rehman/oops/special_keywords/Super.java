package com.rehman.oops.special_keywords;

// SUPER -
// Super method is used to call the chosen constructor of parent class.

// Every parent class extends the class Object
// So that also becomes multi-level-inheritance

// Example -
// class A extends Object { }

class A {

    //    Default Constructor

    public A() {

        super();
        System.out.println("Inside Default Constructor - A");
    }


    //    Parameterized Constructor

    public A(int num1) {
        System.out.println("Inside Parameterized Constructor - A - " + num1);
    }
}

class B extends A {

    //    Default Constructor

    public B() {

//        So by default the super() method is there inside a constructor

//        The super method points to the constructor of parent class
//        Like here the super pointing towards the constructor of A class

//        And here in supermethod we are not passing any argument it calls the default constructor
//        If we pass argument of type which matches to the constructor-parameter it execute that constructor
//        Example A(int a){constructor} and super(5)

        super();
        System.out.println("Inside Default Constructor - B");
    }


    //    Parameterized Constructor

    public B(int num1) {

        super(2);
        System.out.println("Inside Parameterized Constructor - B - " + num1);
    }

}

public class Super {

    public static void main(String[] args) {

        B ref = new B(7);

//        So what's happening here

//        1
//        We are calling the parameterized constructor of B

//        2
//        It checks the superMethod first as it is above

//        3
//        Then it checks the arguments of the superMethod

//        4
//        If have it look for the constructor in parent class

//        5
//        It executes that constructor first

//        6
//        Then executes this constructor

//        ! important
//        We can write the constructor below also there
    }
}