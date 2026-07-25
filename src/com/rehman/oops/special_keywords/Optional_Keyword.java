package com.rehman.oops.special_keywords;

import java.util.Optional;

public class Optional_Keyword {

//    1
//    Have name value

    private static Optional<String> getName1(int id) {
        String name = "Rehman";
        return Optional.ofNullable(name);
    }

//    2
//    Have null

    private static Optional<String> getName2(int id) {
        String name = null;
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {

//        It makes developer realize the name entity can be null
//        So check accordingly

//        It forces you to handle the possibility of missing data instead of accidentally getting a NullPointerException.

        Optional<String> result1 = Optional_Keyword.getName1(1);
        Optional<String> result2 = Optional_Keyword.getName2(2);

        if (result1.isPresent()) {
            System.out.println(result1.get());
        } else {
            System.out.println("Name not found");
        }

        if (result2.isPresent()) {
            System.out.println(result2.get());
        } else {
            System.out.println(result2.orElse("Name not found"));
        }


    }
}
