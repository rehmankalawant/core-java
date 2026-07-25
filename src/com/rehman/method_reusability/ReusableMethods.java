package com.rehman.method_reusability;

public class ReusableMethods {

    public static int toAdd(int num1, int num2) {
        return num1 + num2;
    }

    private static boolean electionEligible(int age) {
        return age >= 18;

//        Ultimately relational-operators return true-false value
//        So no need to do like this
//        return age >= 18 ? true : false;

    }

    public int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }
}