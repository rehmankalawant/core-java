package com.rehman.strings;

public class StringConstantPool {
    public static void main(String[] args) {

        String str1 = "Rehman";
        String str2 = "Rehman";

//        So you might think we are creating two objects
//        Actually not
//        Because of " String Constant Pool "
//        Those both reference variable are pointing towards same memory reference

//        You can check by -
        System.out.println(str1 == str2); //true

//        String Constant Pool
//        A specialized storage area inside the Java Heap memory that caches unique string literals.
//        Because strings are widely used and completely immutable in Java, this pool serves as a built-in optimization

//        Optimization
//        - Reduce duplicate objects
//        - Minimize memory overhead
//        - Boost performance.

//        line 6 - create string and allocate space for string in the area of string constant pool and attach reference with the str1 variable
//        line 7 - check whether we have same string (check with case sensitivity)
//        if it has string ---> then attach reference with str2 variable
//        if not has  ---> then create string and allocate space for string and attach that reference with str2 variable


    }
}