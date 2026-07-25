package com.rehman.conditional_statements;

import java.util.Scanner;

public class Switch_Case {
    int a = 10, b = 20, result, choice;

    private void addition() {
        result = a + b;
        System.out.println("Addition is " + result);
    }

    void substraction() {
        result = a - b;
        System.out.println("Subtraction is " + result);
    }

    void multiply() {
        result = a * b;
        System.out.println("Multiplication is " + result);
    }

    void divide() {
        result = a / b;
        System.out.println("Division is " + result);
    }

    public static void main(String[] args) {

//        Input reference variable
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice");
        System.out.println("1 --> Addition | 2 --> Subtraction | 3 --> Multiply | 4 --> Division");
        int choice = sc.nextInt();


//        Create a reference variable to access the methods inside ( addition , substraction , multiply , divide ) Switch_Case Class

        Switch_Case switchClassReferenceObject = new Switch_Case();


//        Case section must contain break , else all cases get executes

        switch (choice) {

            case 1:
                switchClassReferenceObject.addition();
                break;
            case 2:
                switchClassReferenceObject.substraction();
                break;
            case 3:
                switchClassReferenceObject.multiply();
                break;
            case 4:
                switchClassReferenceObject.divide();
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}