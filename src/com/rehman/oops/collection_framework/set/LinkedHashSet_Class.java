package com.rehman.oops.collection_framework.set;

import java.util.LinkedHashSet;
import java.util.Set;

//    2
//    Linked HashSet
//    The insert order going to be maintained for output-order

public class LinkedHashSet_Class {


    public static void main() {

        Set<Integer> marks = new LinkedHashSet<Integer>();

        marks.add(30);
        marks.add(20);
        marks.add(70);
        marks.add(50);
        marks.add(20);    // duplicate
        marks.add(40);
        marks.add(50);    // duplicate


//        Print the linked-hash-set
        System.out.print("Linked-Hash-Set = ");
        System.out.print(marks);
    }

}

