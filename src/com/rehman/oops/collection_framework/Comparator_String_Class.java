package com.rehman.oops.collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_String_Class {

    public static void main(String[] args) {

//        2
//        Create a comp
//        Comparator<String> ---> Always mention the which-type-of-data-getting-passed
        Comparator<String> comp = new Comparator<String>() {

//            3
//            Override the default compare method
//            1 ---> swap
//           -1 ---> no swap

            @Override
            public int compare(String name1, String name2) {

                if (name1.length() > name2.length())
                    return 1;
                else if (name1.length() < name2.length())
                    return -1;
                else
                    return 0;
            }
        };

        List<String> students = new ArrayList<>();

        students.add("Vikesh");
        students.add("Shiva");
        students.add("Om");
        students.add("Yash");
        students.add("Ram");
        students.add("Rehman");

//        To sort the list

        Collections.sort(students);
        System.out.println("Sorted list = " + students);

//        Custom Logic Sorting

//        1
//        Pass a comparator function
        Collections.sort(students, comp);

//        4
//        Print custom sorted list
        System.out.println("Custom Sorted list = " + students);

    }
}
