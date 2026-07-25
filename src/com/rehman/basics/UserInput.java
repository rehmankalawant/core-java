package com.rehman.basics;

// 1 --> Import Scanner Class
import java.util.Scanner;

// If we wanted to use methods & variables from that class [ here FirstProgram ]
//import com.rehman.basics.FirstProgram;

public class UserInput {
    public static void main(String[] Args) {

        System.out.println("User Input By Scanner Class");

//        Before Scanner
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//        int num1 = bf.read();

//        2 --> Create a reference variable for Scanner class
//        Creating a Scanner object to read input from the keyboard by `system.in`
        Scanner scReference = new Scanner(System.in);

//        ! important
//        Lets understand the meaning of above line
//        I --> Scanner --> the datatype for reference variable
//        II --> scReference --> reference variable name
//        III --> new --> allocate new memory space
//        IV --> Scanner --> calling scanner constructor

//        Once the constructor finishes setting up the object, it returns the specific memory address of that heap space.
//        And all the methods from that class make accessible because of that object-hierarchy
//        Simple it creates the "object of type scanner" obj = {variables:age , methods:show(),hide()}
//        obj = {variables:age(stackMemoryAddress) , methods:show()(stackMemoryAddress) ,hide()(stackMemoryAddress)}

//        The referenceVariable is at stack of the method .
//        So after execution of the constructor it connects the referenceVariable with heapMemoryAddress

//        ! important --> Every class has their own default constructor which is there even if you not-written
//        But if you write any custom constructor, the compiler stops providing that implicit default

//        3 --> Store Input Somewhere

//        Integer
        System.out.print("Integer Input - ");
        int integerInput = scReference.nextInt();

//        String
//        Stop at space - don't use for sentence
        System.out.print("String Input - ");
        String stringInput = scReference.next();

        scReference.nextLine();

//        Sentence / Line
        System.out.print("Sentence Input - ");
        String lineInput = scReference.nextLine();

//        Boolean
        System.out.print("Boolean Input - ");
        boolean booleanInput = scReference.nextBoolean();

//        All Outputs
        System.out.println();

        System.out.println("Integer Input - " + integerInput);
        System.out.println("String Input - " + stringInput);
        System.out.println("Sentence Input - " + lineInput);
        System.out.println("Boolean Input - " + booleanInput);

    }
}