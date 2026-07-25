package com.rehman.oops.nested_class;

class A {
    int age = 20;
    String name = "Rehman";

    public void UserInfo() {
        System.out.println("Hello from outer class");
        System.out.println("I am " + name + " and of age " + age);
    }

    class A1 {

        public void HelloFunction() {
            System.out.println("Hello from inner class");
        }

    }
}

class B {

//    If inner class is static
//    ! important - if inner class is static , outer must be non-static

//    We cannot use non-static elements in static class
//    Why ?
//    We cannot create instance of static class.
//    And if we cannot create reference , how we can use the variable and methods

//    So the methods and variables exist in that class are static
//    We can call them by using the className
//    If the methods and variables are non-static , they remain unused forever.

    static class B1 {
        public void StaticHelloFunction() {
            System.out.println("Hello from static inner class");
        }
    }
}

public class InnerClass {
    static void main(String[] args) {

//        1
//        Accessing outer class

        A objectReference1 = new A();

        objectReference1.UserInfo();

//        2
//        Accessing Inner class

//        Syntax
//        outerClass.innerClass referenceVariable = outerClassReferenceVariable.new innerClassObject();

//        Also cannot do A reference = .... because "A" does not have idea of type of inner class
//        A1 itself is a class so it has blueprint of object type

        A.A1 objectReference2 = objectReference1.new A1();

        objectReference2.HelloFunction();


//        3
//        Accessing static inner class

//      Syntax
//        outerClass.innerClass referenceVariable = outerClassReferenceVariable.new innerClassObject();
        B.B1 objectReference3 = new B.B1();

        objectReference3.StaticHelloFunction();

    }
}
