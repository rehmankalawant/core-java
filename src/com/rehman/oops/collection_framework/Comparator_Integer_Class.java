package com.rehman.oops.collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Integer_Class {

    public static void main(String[] args) {

//        2
//        Create a comp
//        Comparator<Integer> ---> Always mention the which-type-of-data-getting-passed
//        Comparator is FunctionalInterface

        Comparator<Integer> comp = new Comparator<Integer>() {

//            3
//            Override the default compare method using anonymous-class
//            1 ---> swap
//           -1 ---> no swap

            @Override
            public int compare(Integer num1, Integer num2) {

//                List sorted by the ascending order of last-digit

                if (num1 % 10 > num2 % 10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> marks = new ArrayList<>();

        marks.add(472);
        marks.add(873);
        marks.add(478);
        marks.add(294);
        marks.add(136);
        marks.add(681);

//        To sort the list

        Collections.sort(marks);
        System.out.println("Sorted list = " + marks);

//        Custom Logic Sorting

//        1
//        Pass a comparator function
        Collections.sort(marks, comp);

//        4
//        Print custom sorted list
        System.out.println("Custom Sorted list = " + marks);

    }
}
