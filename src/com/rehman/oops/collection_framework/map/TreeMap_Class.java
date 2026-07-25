package com.rehman.oops.collection_framework.map;

import java.util.Map;
import java.util.TreeMap;

//    Tree Map
//    This maintains the order in sorted-form
//    Supports both alphabetic & numeric

public class TreeMap_Class {

    public static void main(String[] args) {

//        1
//        Create a Tree Map with reference-type Map ,
//        Map< keyDataType , valueDataType > objectName = new typeOfObjectHashmap<>();

        Map<String, Integer> marks = new TreeMap<>();

//        2
//        Insert key-value pair

        marks.put("Rehman", 50);
        marks.put("Yash", 80);
        marks.put("Vikesh", 100);
        marks.put("Shivaji", 70);

//        3
//        Print the Tree Map

        System.out.println(marks);

    }
}
