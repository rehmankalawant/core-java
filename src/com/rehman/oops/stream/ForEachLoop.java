package com.rehman.oops.stream;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {

        List<Integer> numArray = Arrays.asList(20, 10, 40, 50, 70, 30);

//        1
//        For loop

        System.out.print("For Loop = ");
        for (int i = 0; i < numArray.size(); i++) {

            System.out.print(numArray.get(i) + " ");

        }


//        2
//        Enhanced For loop

        System.out.println();
        System.out.print("Enhanced For loop = ");
        for (int num : numArray) {

            System.out.print(num + " ");

        }


//        3
//        For Each loop

        System.out.println();
        System.out.print("For Each loop = ");

        numArray.forEach(num -> System.out.print(num + " "));

//        listArray.forEach( storeIn -> outputUsing StoreIn )
//        We can directly access element with looping like normal for loop


//        ! important
//        How forEach() works behind the scenes

//        i --> it create am object of consumer interface
//        default void forEach(Consumer<? super T> action)  , like this

//        ii --> The only method it has is `accept`
//        iii --> Override using anonymous-class

//        iv --> That method take one element at a time
//        v --> We can perform any operation on it

//        instead of creating referenceVar of consumer and passing that reference in forEach we directly pass this into directly in forEach

    }
}
