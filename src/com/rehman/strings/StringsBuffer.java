package com.rehman.strings;

public class StringsBuffer {
    public static void main(String[] args) {

//        In Java strings are immutable - cannot be changed

//        So to solve this problem we have
//        StringBuffer
//        This makes your string mutable
//        Gives extra 16-character --> to reduce the relocation of memory always being in continues data change , what if there is no memory left

//        StringBuffer is Thread safe
//        StringBuilder is not Thread safe

        StringBuffer name = new StringBuffer("Rehman");

//        Total capacity - length + 16
        System.out.println("Capacity : " + name.capacity()); // 22

//        Total string length
        System.out.println("Length : " + name.length()); // 6

//        Append the string
        System.out.println("Append : " + name.append(" Kalawant")); // Rehman Kalawant

//        Convert from BufferString to string
        System.out.println("toString :" + name.toString());

//        We can insert any string in between
        System.out.println("insert :" + name.insert(7, "C. ")); // Rehman C. Kalawant

//        Set length for string
        name.setLength(50);
        System.out.println("setLength : " + name.length()); // 50

    }
}