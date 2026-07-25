package com.rehman.loops;

public class Continue {
    public static void main(String[] args) {

//        Continue
//        Skip the current iteration and continue for next loop

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }
            System.out.println(i);

        }
    }
}