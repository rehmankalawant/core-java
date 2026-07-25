package com.rehman.oops.collection_framework.set;

import java.util.HashSet;
import java.util.Set;

//    Set
//    An interface from Java with unordered collection of unique elements
//    No duplicate value
//    No index

//    Methods
//    add() , remove() , contains()

//    1
//    Hashset
//    No order maintained

public class HashSet_Class {

    public static void main() {

//        1
//        Initialize the set

        Set<Integer> marks = new HashSet<Integer>();

//        2
//        Add elements

        marks.add(30);
        marks.add(20);
        marks.add(70);
        marks.add(50);
        marks.add(20);    // duplicate
        marks.add(40);
        marks.add(50);    // duplicate

//        2
//        Element have or not
//        System.out.println(" Element have or not - " + marks.contains(20));

//        3
//        Print the hash-set
        System.out.print("Hash-Set = ");
        System.out.print(marks);

    }
}
