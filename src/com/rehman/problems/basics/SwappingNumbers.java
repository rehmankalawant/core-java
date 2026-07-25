package com.rehman.problems.basics;

public class SwappingNumbers {
    public static void main(String[] args) {

//        With third variable

        int num1 = 4, num2 = 7, temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Number_1 is : " + num1 + " , Number_2 is : " + num2);

//        Without third variable

        int number1 = 10;
        int number2 = 20;

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("Number_1 is : " + number1 + " , Number_2 is : " + number2);

    }
}