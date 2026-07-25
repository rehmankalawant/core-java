package com.rehman.oops.casting;

// Casting from Child to Parent

// Type casting the child-object with parent-reference

// Convert datatype from Child to Parent

// Remember when you done A ref = new B();
// in package com.rehman.oops.basics;

// When child have any extra method and if the type of the object is Parent but object of type is child
// Here parent have no idea about the type of that method
// So here we typecast the Child-Type to access those methods

class Parent1 {

    public void showP() {
        System.out.println("Inside Parent Show");
    }

}

class Child1 extends Parent1 {
    public void showC() {
        System.out.println("Inside Child Show");
    }
}


public class UpCasting {

    public static void main(String[] args) {

//        Parent --> Object type is of Parent
//        obj1 --> Reference object
//        new --> Memory allocation
//        Child --> Object of type Child

//        Parent obj1 = new Child();      // Also valid for below.
//        Like below the (Parent) is always there by default , but we can't see it
//        (Parent) is implicitly there behind the scene
//        And it is not compulsory to write that (Parent)

        Parent1 obj = (Parent1) new Child1();

        obj.showP(); // only parent methods are callable

//        2 Reasons
//        1. All methods parent have child have that because inheritance and object-of-type is `Child` here
//        2. Since child have methods of parent and type-of-object is Parent itself
//        So only parent methods accessible

    }


}