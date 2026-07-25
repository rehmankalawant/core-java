package com.rehman.oops.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//  Map
//  We can access every index element at a time and can perform any operation

public class Map_Class {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 7, 2, 9, 5, 3, 1);

//        Data must be stored in stream data type

//        StreamDataType<arrayListDataType> var = arrayListName.stream().map( n-> anyOperation );

        Stream<Integer> s1 = nums.stream().map(n -> n * 2);

//        Printing the stream using forEach

        s1.forEach(n -> System.out.print(n + " "));

//        We cannot use the stream again
//        It is one time use only

//        If tried to use , it gives runtime error ,
//        ERROR
//        java.lang.IllegalStateException: stream has already been operated upon or closed

        s1.forEach(n -> System.out.print(n + " "));

    }
}
