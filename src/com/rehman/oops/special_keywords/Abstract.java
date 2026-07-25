package com.rehman.oops.special_keywords;

//  a non-access modifier used to achieve data abstraction,
//  Which hides complex implementation details and exposes only the essential features of an object.

//  An abstract class serves as a partial template or blueprint for other classes

//  An abstract method is a method that is declared without any implementation.
//  Any concrete (normal) subclass extending the parent abstract class must override and implement all its abstract methods.

//  We cannot create Object/Instance of the abstract class
//  We can have reference-datatype of abstract class

//  In simple term
//  If you know you want some functionality but at this moment you don't know the implementation
//  You can create class with `abstract` keyword
//  To avoid if someone extends you , avoid conflict and that tell I have this functionality, and you must implement/override this

//  And abstract method must be inside the abstract-class
//  But it is not compulsory to have abstract methods inside the abstract-class


abstract class Car {

    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing Music");
    }

}

class Toyota extends Car {

//    If we not declare & initialize drive method
//    ERROR
//    Class 'Toyota' must either be declared abstract or implement abstract method 'drive()' in 'Car'

    public void drive() {
        System.out.println("Toyota is driving");
    }

    public void fly() {
        System.out.println("Toyota is flying");
    }
}


public class Abstract {

    public static void main(String[] args) {
//        Car obj = new Car(); // ERROR  // 'Car' is abstract; cannot be instantiated
/*

        //  Called as anonymous inner class
        //  Used to override the methods

        Car objectReference = new Car() {
            public void drive() {
                System.out.println("Overriding the method in main-method");
            }
        };

        objectReference.drive();

 **/


        Toyota obj = new Toyota();

        obj.drive();
        obj.fly();
    }
}
