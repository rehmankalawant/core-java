package com.rehman.oops.collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//    2
//    Implement the Comparable Class in our class
//    Provide our own custom datatype
//    And as it is an abstract class , we must implement the compareTo() method

class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    3
//    Implement the compareTo() method

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else if ((this.age < that.age))
            return -1;
        else
            return 0;

    }

}


public class Comparable_Class {


    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Rehman", 25));
        studentList.add(new Student("Yash", 21));
        studentList.add(new Student("Shivaji", 28));
        studentList.add(new Student("Vikesh", 23));

//        Collections.sort(studentList);
//        ERROR
//        reason: no instance(s) of type variable(s) T exist so that Student conforms to Comparable<? super T>

//        1
//        Integer extends the comparable-class
//        That's make it sortable
//        So we can make our class comparable-class

//        4
//        Sort using collection

        Collections.sort(studentList);

//        5
//        Print the list

        for (Student studentValue : studentList) {
            System.out.println("{ Name = " + studentValue.name + " , Age = " + studentValue.age + " }");
        }

    }
}
