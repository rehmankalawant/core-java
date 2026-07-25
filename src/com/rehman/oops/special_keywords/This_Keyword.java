package com.rehman.oops.special_keywords;

class Employee {

    private String name;

//    This always points to its current object

//    So we are passing an object as parameter
//    So that at the time of calling the method should be aware about the name is going to bind with which object

//    Example
//    If we create an object of emp1 and emp2
//    So when we are setting value we do emp1.methodName
//    So here we are passing argument of the object to store the value in that object only

    public void setName1(String name, Employee obj) {
        obj.name = name;
    }

//    Java automatically provide the objectName by which we are calling the method with the "this" keyword
//    Example
//    emp1.setName2("Shivaji");
//    Here java automatically attach the object name to the method
//    No need to pass parameters - arguments

    public void setName2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class This_Keyword {

    public static void main(String[] args) {

//        1
//        Creating reference object
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

//        2
//        Setting names

        emp1.setName1("Yash", emp1);

        emp2.setName2("Rehman");


//        3
//        Getting names

        System.out.println(emp1.getName());
        System.out.println(emp2.getName());


    }
}