package com.rehman.operators;

public class DecrementOperators {
    public static void main(String[] args) {

//        Decrement Operator
//        Decrement operators are used to decrease value of a variable .

        int a = 10, b = 10;

//        1
//        Prefix Decrement Operator
//        First decrease the value then store it in memory (in our case print value)
//        Decrease the value then fetch it

        System.out.println("Prefix Decrement");
        System.out.println(--a);
        System.out.println(a + "\n");

//        2
//        Postfix Decrement Operator
//        First store the value in memory (in our case print value) then decrease the value then
//        Fetch the value then decrement it

        System.out.println("Postfix Decrement");
        System.out.println(b--);
        System.out.println(b + "\n");
    }
}