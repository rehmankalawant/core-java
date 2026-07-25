package com.rehman.problems.basicsplus;

public class ArmstrongNumber {
    public static void main(String[] args) {

//        The Number 153 is Armstrong Number .
//        1³ + 5³ + 3³ = 1 + 125 + 27 = 153
//        1⁴ + 6⁴ + 3⁴ + 4⁴ = 1 + 1296 + 81 + 256 = 1634

        int number = 153, sum = 0, digits = 0;

        int temp = number;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int tempNum = number;
        while (tempNum > 0) {

            int singleDigit = tempNum % 10;
            int mult = 1;

            for (int i = 1; i <= digits; i++) {
                mult = mult * singleDigit;
            }

            sum = sum + mult;
            mult = 1;
            tempNum = tempNum / 10;
        }

        System.out.println(sum);

    }
}