package com.rehman.oops.other;

//  Lambda Expression
//  A shorter form to write Methods
//  Same like Arrow-Function in JavaScript

//  The important thing is -
//  lambda expression only applicable for Functional Interfaces
//  means only one function should be there in the interface

@FunctionalInterface
interface Calculator {

    void calculator();

}

@FunctionalInterface
interface Addition {

    int addition(int num1, int num2);

}

@FunctionalInterface
interface Subtraction {

    int subtraction(int num1, int num2);

}

public class LambdaExpression {

    Calculator calc = () -> {
        System.out.println("Hello from calculator");
    };

    Addition add = (num1, num2) -> {
        return num1 + num2;
    };


    public static void main(String[] args) {

        LambdaExpression ref = new LambdaExpression();

//        First 'calc' is the field, second 'calc()' is the interface method

//        Here calc is acts like a reference variable of an anonymous class
//        By using that ref variable you can access the values from enum
//        Refer the topic for this
//        package com.rehman.oops.advance.nested_class;


        ref.calc.calculator();
        System.out.println(ref.add.addition(10, 20));

        Subtraction sub = (num1, num2) -> {
            return num1 - num2;
        };
        System.out.println(sub.subtraction(30, 10));

    }

}
