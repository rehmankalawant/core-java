package com.rehman.oops.basics.four_pillars;

class User {

//    1
//    Making the variable private so no one can access them outside the class

    private int age;
    private String name;

//    2.1
//    Setting the value for variables

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

//    2.2
//    Making methods with variables to share across the classes

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

//        Encapsulation
//        Binding variables with the methods into a single unit

//        It restricts direct access to an object's internal components

//        Simple :
//        Making the variables private and access them using public methods

//        So the only way to access the data is using methods only

//        3
//        Creating instance / reference variable of class User
        User instanceVariable = new User();

//        4
//        setter
//        Using the methods here to setValues

        instanceVariable.setAge(28);
        instanceVariable.setName("Rehman");

//        creating object and storing information
        User student1 = new User();
        student1.setAge(20);
        student1.setName("Yash");

//        5
//        getter
//        Using the methods here to getValues

        System.out.println(instanceVariable.getName() + " - " + instanceVariable.getAge() + " age");
        System.out.println(student1.getName() + " - " + student1.getAge() + " age");

    }
}