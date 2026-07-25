package com.rehman.oops.collection_framework.set;

import java.util.Set;
import java.util.TreeSet;

//    3
//    Tree HashSet
//    The output in ascending order
//    We get a sorted array

public class TreeSet_Class {

    public static void main() {

        Set<Integer> marks = new TreeSet<Integer>();

        marks.add(30);
        marks.add(20);
        marks.add(70);
        marks.add(50);
        marks.add(20);    // duplicate
        marks.add(40);
        marks.add(50);    // duplicate


//        Print the linked-hash-set
        System.out.print("Tree-Set = ");
        System.out.print(marks);

    }

}
