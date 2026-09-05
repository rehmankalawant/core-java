package com.rehman.oops.casting;

//  !important
//  Child2 obj1 = (Child2) obj;
//  The matter is only that the object which is created referring whom , and where is he
//  here the parent type of object  referring the child is at up - so downcast

// Casting from Parent to Child

// Convert datatype from Parent to Child

// Type casting a parent class reference back to a child class reference

class Parent2 {

    public void showP() {
        System.out.println("Inside Parent Show");
    }

}

class Child2 extends Parent2 {
    public void showC() {
        System.out.println("Inside Child Show");
    }
}

public class DownCasting {

    public static void main(String[] args) {

//        Parent --> Object type is of Parent
//        obj1 --> Reference object
//        new --> Memory allocation
//        Child --> Object of type Child

        Parent2 obj = new Child2();

//        Process of returning to change reference from parent-class-reference to child-class-reference

        obj.showP(); // Parent methods accessible only

//        Typecasting

//        Child2 obj1 = obj; // ERROR // its says I have reference parent earlier

//        I have Child2 object, but it is referred with datatype Parent2
//        So we have to explicitly change there type like how we do in type casting

//                     double number = 11.67;
//        similar to - Parent2 obj = new Child2();

//                     int typeCastedNumber = (int) number;
//        similar to - Child2 obj1 = (Child2) obj;

        Child2 obj1 = (Child2) obj;

        obj1.showC();

    }

}