package com.rehman.operators;

public class IncrementOperators {
    public static void main(String[] args) {

//        Increment Operator
//        Increment operators are used to increase value of a variable .

        int a = 10, b = 10;

//        1
//        Prefix Increment Operator
//        First increase the value then store it in memory (in our case print value)
//        Increase the value then fetch it

        System.out.println("Prefix Increment");
        System.out.println(++a);
        System.out.println(a + "\n");

//        2
//        Postfix Increment Operator
//        First store the value in memory (in our case print value) then increase the value then
//        Fetch the value then increment it

        System.out.println("Postfix Increment");
        System.out.println(b++);
        System.out.println(b + "\n");
    }
}