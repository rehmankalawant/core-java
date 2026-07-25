package com.rehman.oops.special_keywords;

//    Record Class
//    A special type of class declaration designed to act as an immutable data carrier with minimal boilerplate code
//    records automatically generate private final fields, a constructor, getters, equals(), hashCode(), and toString() methods from a single line of declaration.

//    no-automatic default constructor

record Student(int id, String name, double percent) {
}

//    Not Needed
class Student1 {
    int id;
    String name;
    double percent;

//    create constructor when object created to assign values

}

public class Record_Class {

    public static void main(String[] args) {

//        1
//        Checking automatic constructor

        Student student1 = new Student(1, "Yash", 92.20);
        Student student2 = new Student(2, "Rehman", 90.80);
        Student student3 = new Student(3, "Vikesh", 88.40);
        Student student4 = new Student(1, "Yash", 92.20);

//        2
//        Checking automatic final fields

//        student1.name="Shivaji";    // ERROR // 'name' has private access in 'com.rehman.oops.special_keywords.Student'

//        3
//        Checking automatic getter
        System.out.println(student2);


//        3
//        Checking automatic equals()
        System.out.println(student1.equals(student4));
        System.out.println(student2.equals(student4));


    }
}
