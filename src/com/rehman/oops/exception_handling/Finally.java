package com.rehman.oops.exception_handling;

//  The finally block execute irrespective is there any error or not

//  try execution --> finally
//  catch execution --> finally

//  Sometimes this finally block used to close the resources sc.close();

public class Finally {
    public static void main(String[] args) {

        try {
            int infinity = 0 / 0;
            System.out.println(infinity);

        } catch (Exception err) {
            System.out.println("Error Occurred " + err);
        } finally {
            System.out.println("Finally Block Executing ...");
        }

    }
}
