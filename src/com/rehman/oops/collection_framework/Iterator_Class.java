package com.rehman.oops.collection_framework;

//    Iterator -
//    Iterator provides a standardized way to traverse any collection sequentially

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Class {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

//        1
//        To add element to list
        arr.add(25);
        arr.add(10);
        arr.add(18);
        arr.add(20);

//        2
//        Iterate
        Iterator<Integer> iter = arr.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }


    }
}
