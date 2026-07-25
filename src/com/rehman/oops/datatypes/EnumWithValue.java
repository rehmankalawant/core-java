package com.rehman.oops.datatypes;

enum StudentsWithMarks {

    //    These are all object we created of class StudentsWithMarks
    Rehman, Yash, Vikesh;

//    to set mark in one object
//    Rehman = {marks:0}
//    Rehman.marks = 100
//    Rehman.setmarks(100)

    //    private variables
    private int marks;


    //    Setter function to set value for the object
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

}

public class EnumWithValue {

    public static void main(String[] args) {

//        Create reference to create object

//        Here we don't need new because we already have Rehman as an object
//        And that acquired a space
//        we just want to have and reference for that

//        ! important
//        If you have an object already , don't create object of object
//        Just create a reference for that object

//                             Laptop lap = new Laptop();
//        this part is reference creation = this part is object creation

        StudentsWithMarks rehman = StudentsWithMarks.Rehman;
        StudentsWithMarks yash = StudentsWithMarks.Yash;
        StudentsWithMarks vikesh = StudentsWithMarks.Vikesh;

        rehman.setMarks(2026);
        yash.setMarks(1700);

        System.out.println(StudentsWithMarks.Rehman + " : " + rehman.getMarks());
        System.out.println(StudentsWithMarks.Yash + " : " + yash.getMarks());
        System.out.println(StudentsWithMarks.Vikesh + " : " + vikesh.getMarks());


    }
}
