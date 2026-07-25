package com.rehman.strings.problems;

public class Alphabets_WithTypecasting {
    public static void main(String[] args) {

        for (int i = 65; i <= 90; i++) {

            char alphabet = (char) i;
//            typeToStore variableName = (conversionDataType) conversionEntity

            System.out.print(alphabet + " ");
        }

        System.out.println();

        for (int i = 97; i <= 122; i++) {

            char alphabet = (char) i;

            System.out.print(alphabet + " ");
        }
    }
}