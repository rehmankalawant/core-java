package com.rehman.oops.special_keywords;

//    Sealed
//    It allows specific classes only to extend
//    It restricts other classes to extend the class which are not permitted

//    cannot extend --- but can access

//    apply sealed keyword to class
//    at the end before opening curly-braces use keyword permits and then class names (comma-separated-if-two-or-more)

//    the child classes also must be -
//    sealed , non-sealed , or final

sealed class P permits Q, S, R {

    public void HelloMethod() {
        System.out.println("Hello From Sealed-Class");
    }

}

final class Q extends P {

}

non-sealed class R extends P {

}

final class S extends P {

}

/*

class T extends P {
    'com.rehman.oops.special_keywords.T' is not allowed in the sealed hierarchy
}

*/

public class Sealed_Keyword {
    public static void main(String[] args) {

        Q obj = new Q();

        obj.HelloMethod();

    }
}
