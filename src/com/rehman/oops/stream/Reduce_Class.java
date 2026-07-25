package com.rehman.oops.stream;

import java.util.Arrays;
import java.util.List;

//  Reduce
//  We can access every index element at a time and can perform any operation which reduce the output to single form

public class Reduce_Class {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

//        Data must be stored in stream data type

//        int/string var = arrayList.stream().reduce(
//        n--initialValue = 0,
//        (c--current accumulated result,
//        e--current element from the stream) -> c + e);

        int n;
        int sum = nums.stream().reduce(n = 0, (c, e) -> c + e);

//        Printing the stream using forEach

        System.out.print("The sum is " + sum);
    }
}
