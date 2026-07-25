package com.rehman.arrays;

// 1 --> Creating a class of student with its properties with datatype like rollNumber , percentage , name

import java.util.Arrays;

class Student {

    int rollNumber;
    double percentage;
    String name;

}

public class ArrayOfObjects {
    public static void main(String[] args) {

//        2 --> Create a reference variable object , so that it will acquire memory in heap

        Student student1 = new Student();
        student1.name = "Yash";
        student1.rollNumber = 11;
        student1.percentage = 92.20;

        Student student2 = new Student();
        student2.name = "Rehman";
        student2.rollNumber = 20;
        student2.percentage = 84.40;

        Student student3 = new Student();
        student3.name = "Vikesh";
        student3.rollNumber = 67;
        student3.percentage = 94.00;

//        3 --> Create an array which will hold these all objects at once
//        - Student[] = Datatype of array is student-type-of-array
//        - studentInfo = Name of array
//        - new = Create memory space in JVM
//        - Student[3] = Type of internal variable is Student.name = String | Student.percentage = double
//        - Student[3] = Size / Length of array is 3

        Student[] studentsInfo = new Student[3];

        studentsInfo[0] = student1;
        studentsInfo[1] = student2;
        studentsInfo[2] = student3;

//        System.out.println(Arrays.deepToString(studentsInfo));
//        [com.rehman.arrays.Student@2a84aee7, com.rehman.arrays.Student@a09ee92, com.rehman.arrays.Student@30f39991]

//        int[] num because inside array we know type of element num is int
//        studentObject datatype will be Student ( cause inside class we defined it already)
//        In our case Student class has all datatype so Student tell the studentsObject consist of 3 properties and their datatypes


        for (Student studentObject : studentsInfo) {

            System.out.println(studentObject.rollNumber + " : " + studentObject.name + " : " + studentObject.percentage);

        }

    }
}