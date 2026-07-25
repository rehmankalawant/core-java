package com.rehman.loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        int frequency = 6;

//        Do While loop executes once then check the condition and runs till the condition becomes false
//        i.e. Even if your condition is false this loop runs at-least once

        do {
            System.out.println(frequency + " . Rehman");
        }
        while (frequency < 5);
    }
}