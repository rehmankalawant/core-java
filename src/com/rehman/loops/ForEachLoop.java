package com.rehman.loops;

public class ForEachLoop {
    public static void main(String[] args) {

//        Integer Array
        int arrInteger[] = {10, 20, 30, 40, 50, 60};

//        String Array
        String arrString[] = {"Vikesh", "Rehman", "Yash"};


        for (int num : arrInteger) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (String name : arrString) {
            System.out.print(name + " ");
        }
    }
}