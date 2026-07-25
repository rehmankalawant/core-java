package com.rehman.oops.collection_framework.list;

import java.util.LinkedList;

public class LinkedList_Class {
    public static void main(String[] args) {

//        1
//        Creation

        LinkedList<String> cars = new LinkedList<>();


//        2
//        Adding elements (O(1) at end)

        cars.add("Volvo");
        cars.add("BMW");
        cars.addFirst("Mahindra"); // O(1) at front
        cars.addLast("Ford");   // O(1) at end


//        3
//        Accessing elements (O(n) traversal)

        System.out.println("First Car: " + cars.getFirst());
        System.out.println("Car at index 2: " + cars.get(2));


//        4
//        Updating elements

        cars.removeFirst();
        cars.remove("BMW");


//        6
//        Iterating

        for (String car : cars) {
            System.out.println(car);
        }


//        7
//        Printing directly

        System.out.println(cars);
    }
}

