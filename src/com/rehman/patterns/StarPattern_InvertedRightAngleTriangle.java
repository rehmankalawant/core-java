package com.rehman.patterns;

public class StarPattern_InvertedRightAngleTriangle {

    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* " + " ");
            }

//            For next-line purpose
//            When done with all columns of first row

            System.out.println();

        }
    }
}


// Output

/*

 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *

 */