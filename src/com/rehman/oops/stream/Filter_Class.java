package com.rehman.oops.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//  Filter
//  We can access every index element at a time and can perform any condition to get desired output

public class Filter_Class {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 7, 2, 9, 5, 3, 1, 8);

//        Data must be stored in stream data type

//        StreamDataType<arrayListDataType> var = arrayListName.stream().filter( n-> anyConditionToPerform );

        Stream<Integer> s1 = nums.stream().filter(n -> n % 2 == 0);

//        Printing the stream using forEach

        s1.forEach(n -> System.out.print(n + " "));

    }
}
