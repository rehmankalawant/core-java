package com.rehman.oops.basics;

class ParentClass {
    public void show() {
        System.out.println("Inside parent");
    }

    public void low() {
        System.out.println("Inside parent");
    }
}

public class DynamicMethodDispatch extends ParentClass {

    public void show() {
        System.out.println("Inside child show");
    }

    public void hide() {
        System.out.println("Inside child hide");
    }

    public static void main(String[] args) {

//        Child Object Type

        ParentClass ref1 = new DynamicMethodDispatch();

        ref1.show();

//        Parent Object Type

        ParentClass ref2 = new ParentClass();

        ref2.show();

//        ! important
//        So here the Object of type .... decides which method is going to execute at runtime
//        Not by the datatype of referenceVariable / referenceObject


//        ! important
//        Child has methods(extra) <---> Datatype has no datatype ===> Also not visible when invoking with ref
//        Parent has methods(extra) <--> Child not ===> Visible (cause whatever parent have is of child , (every datatype , variable , method , everything)

//        We can say this as Abstraction
//        Because we are hiding details (methods) from the parent

//        ref.hide(); // ERROR // The hide method is not in that reference variable
//        If we wanted to access that we have to create a reference variable with type of Child and with object type of child


    }

}