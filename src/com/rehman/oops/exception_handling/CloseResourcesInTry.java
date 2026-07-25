package com.rehman.oops.exception_handling;

import java.util.Scanner;

public class CloseResourcesInTry {
    public static void main(String[] args) {

//        By passing the creation of sc --scanner object-- inside the try()
//        It automatically close the resources when try block get executed
//        You don't need to call sc.close() manually.

//        So always try to write the resources inside parentheses of try
//        Like , try( resources ){ // block of code }

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the number ");

            int number = sc.nextInt();

            System.out.println("The number is " + number);

        } catch (Exception err) {
            System.out.println("Error Occurred " + err);

        }
    }
}
