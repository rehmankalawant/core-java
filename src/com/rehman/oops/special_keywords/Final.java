package com.rehman.oops.special_keywords;

// Final
// Used to make constants
// When we attach this keyword to variable , methods , class ---> we cannot change that further

public class Final {

    public static void main(String[] args) {

//        1
//        Final Variable
//        Cannot assign value for the next time

        final int age = 20;
//        age = 28; // ERROR  // Cannot assign a value to final variable 'age'

    }

}

// 2
// Final Class
// Unable to extend the class

final class Calculator {

    public final int add(int num1, int num2) {
        return num1 + num2;
    }
}

//class AdvancedCalculator extends Calculator {
//}
// ERROR  // Cannot inherit from final class 'com.rehman.oops.special_keywords.Calculator'


// 3
// Final Method
// Unable to override the class

class Calculator1 {

    public final int add(int num1, int num2) {
        return num1 + num2;
    }
}

final class Calculator2 extends Calculator1 {

/*    public int add(int num1, int num2) {
        return num1 + num2 + 1;
    }

**/

//    ERROR
// 'add(int, int)' cannot override 'add(int, int)' in 'com.rehman.oops.special_keywords.Calculator1'; overridden method is final
}