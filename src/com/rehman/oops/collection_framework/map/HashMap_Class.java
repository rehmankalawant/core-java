package com.rehman.oops.collection_framework.map;

import java.util.HashMap;
import java.util.Map;

//    Map
//    HashMap
//    Collection of key-value pair
//    This does not maintain the order

//    This gives us power to define our own keys

//    Rule
//    The key cannot be repeated

public class HashMap_Class {

    public static void main(String[] args) {

//        1
//        Create a Hashmap with reference-type Map ,
//        Map< keyDataType , valueDataType > objectName = new typeOfObjectHashmap<>();

        Map<String, Integer> marks = new HashMap<String, Integer>();

//        2
//        Insert key-value pair

        marks.put("Rehman", 50);
        marks.put("Yash", 80);
        marks.put("Vikesh", 100);
        marks.put("Shivaji", 70);

//        get-value by index
        System.out.println("Get value by key - " + marks.get("Rehman"));

//        all-keys
        System.out.println("All keys = " + marks.keySet());

//        all-values
        System.out.println("All keys = " + marks.values());

//        Delete Key-value (Data)
        marks.remove("Yash");

        System.out.println(marks);

    }
}
