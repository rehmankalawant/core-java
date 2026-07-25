package com.rehman.oops.collection_framework.map;

import java.util.LinkedHashMap;
import java.util.Map;

//    Linked-HashMap
//    This maintains the insertion ordered

public class LinkedHashMap_Class {

    public static void main(String[] args) {

//        1
//        Create a LinkedHashMap with reference-type Map ,
//        Map< keyDataType , valueDataType > objectName = new typeOfObjectHashmap<>();

        Map<String, Integer> marks = new LinkedHashMap<>();

//        2
//        Insert key-value pair

        marks.put("Rehman", 50);
        marks.put("Yash", 80);
        marks.put("Vikesh", 100);
        marks.put("Shivaji", 70);

//        3
//        Print the Linked Hashmap

        System.out.println(marks);

    }
}
