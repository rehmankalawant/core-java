package com.rehman.oops.basics;

public class MethodOverloading {

//    Method Overloading

//    Method Overloading allows multiple methods with the same name but different parameters within the same class

//    Loading multiple methods

//    Also known as Compile Time Polymorphism

    public int addition(int number1, int number2) {
        return number1 + number2;
    }

    public int addition(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public double addition(double number1, double number2) {
        return number1 + number2;
    }

//    So all above methods has same name but the datatype of parameters and return type is different

//    So when we call them at that moment java will identify by itself which method to invoke

    public static void main(String[] args) {

        MethodOverloading referenceVariable = new MethodOverloading();

        System.out.println("With 2 numbers (return int) = " + referenceVariable.addition(2, 3));
        System.out.println("With 3 numbers (return int) = " + referenceVariable.addition(2, 3, 5));
        System.out.println("With 2 numbers (return double) = " + referenceVariable.addition(2.82, 6.71));
    }

}