package com.rehman.oops.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

//    COLLECTIONS -
//    COLLECTIONS ALWAYS WORKS WITH OBJECT VALUES / WRAPPER CLASS

//    ArrayList
//    An ArrayList in Java is a resizable, dynamic array
//    ArrayList automatically grows or shrinks in size as elements are added or removed.

//    Arraylist always works with object
//    So the datatype must be a wrapper-class or custom-class-as-reference-object

//    Methods
//    add() , remove() , get() , contains()


public class ArrayList_Class {

    public static void main(String[] args) {

        List<Integer> arr1 = new ArrayList<>();

//        1
//        To add element to list
        arr1.add(25);
        arr1.add(10);
        arr1.add(18);
        arr1.add(20);


//        2
//        Get element by index
        System.out.println("The element at index is - " + arr1.get(3));

//        3
//        To remove the element from list
        arr1.remove(1);

//        4
//        Get index by element
        arr1.indexOf(25);

//        5
//        Check element present or not
        System.out.println("Element present or not - " + arr1.contains(20));

//        6
//        Can directly print the array without loop-iterations
//        Directly with name of arraylist
        System.out.println(arr1);


//        String list

//        Try to put reference type as List<>
//        Because in future if you convert from one list - to another the reference type will not make any trouble
//        If made specific intentionally , and you know this is one time use or no-conversion , then okay

        ArrayList<String> arr2 = new ArrayList<String>();

        arr2.add("Rehman");
        arr2.add("Yash");
        arr2.add("Vikesh");

        System.out.println(arr2);


    }


}
