package com.rehman.basics;

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

    }
}
