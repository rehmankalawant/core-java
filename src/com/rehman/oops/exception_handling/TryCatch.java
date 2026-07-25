package com.rehman.oops.exception_handling;

//  If there is an exception it does not block the further execution
//  It simply throws an error and execute the further part

//  try --> The block get execute
//  catch --> execute when an error occurs

public class TryCatch {

    public static void main(String[] args) {

        try {
            int division = 11 / 0;
//            We know this is not possible

            System.out.println(division);
        } catch (Exception err) {
            System.out.println("Exception is " + err);
        }

//        Written this to make sure this get executed even if there is an error / exception in-between

        int addition = 2 + 5;
        System.out.println(addition);

    }
}
