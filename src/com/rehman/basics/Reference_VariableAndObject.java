package com.rehman.basics;

import java.util.Scanner;

class Student {
    String name;
    int age;

    public void studentMethod() {
        System.out.println("Inside Student Method");
    }
}

public class Reference_VariableAndObject {

    public static void main(String[] args) {

//        Difference between Reference_Variable And Reference_Object(Object Creation)

//        1
//        Reference_Variable

        Student student1;

//        student1.studentMethod();  // ERROR   // Variable 'student1' might not have been initialized
//        By creating reference variable we are not creating the actual memory in heap
//        Hence there is no these methods exist in that reference-variable


//        2
//        Reference_Object(Object Creation)

        Student student2 = new Student();

        student2.studentMethod();

//        By creating reference object we are creating the actual memory in heap
//        Hence there are all these methods exist in that reference-variable


//        Reference_Variable_Reference

        Student ref = new Student();

//        ! important
//        Lets understand the meaning of above line
//        I --> Student
//        --> the datatype for reference variable
//        --> means the type of variable and function will refer the datatype from this

//        II --> ref
//        --> reference variable name
//        --> the name which is at heap and refer by stack

//        III --> new
//        --> allocate new memory space

//        IV --> Student()
//        --> calling the default constructor to create object of that same class



        /*
         *
         # Visual Representation of Heap-Stack while creating an object / reference

         # Stack

         Variable   Value
         --------   -----
         ref        101


         # Heap

         Address   Object
         -------   ----------------
         101       Student Object
                   name = null
                   age = 0

         *
         * */

    }
}
