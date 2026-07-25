package com.rehman.oops.other;

//  A class whose object values cannot be changed or updated after they are created is called an Immutable Class

final class Student {
    private final String name;
    private final int age;
    private final String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;

    }

    public String getName() {
        return name;

//        this.name
//        this means --> reference objectName --> name= heapReferenceNumber -->
//        when you call
//        this.getName() --> 10xx26.getName()
//        And from the stack it calls that method, and it says when I am calling this return me the name from the stack name

    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return "{\"department\":\"" + department + "\"}";
    }
}

public class ImmutableClass {

    public static void main(String[] args) {

//        Inbuilt Classes
//        Integer, Double, Boolean

//        User defined classes

        Student student1 = new Student("Rehman", 24, "Artificial Intelligence");

//        student1.name = "yash"; // ERROR  // 'name' has private access in 'com.rehman.oops.other.Student'

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getDepartment());

    }

}
