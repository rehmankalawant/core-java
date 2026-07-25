package com.rehman.oops.exception_handling;

//  If there is an exception it does not block the further execution
//  It simply throws an error and execute the further part

//  try --> The block get execute
//  catch --> execute when an error occurs

public class Try_WithMultipleCatch {

    public static void main(String[] args) {

        try {
//            ArithmeticException
            int division = 14 / 0;
            System.out.println(division);

//            NullPointerException
            String str = null;
            System.out.println(str.length());

//            ArrayIndexOutOfBoundsException
            int[] num = new int[5];
            System.out.println(num[5]); // 5th index , we only have 4

        } catch (ArithmeticException err) {
            System.out.println("Cannot divided by 0");
        } catch (NullPointerException err) {
            System.out.println("String should have least one character");
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println();
        } catch (Exception err) {
            System.out.println();
        }

//        Exception is Parent to all other specific ExceptionClasses ArithmeticException , ArrayIndexOutOfBoundException
//        So try to put the Exception in last catch block because if it will be on top it will resolve all the issue at            his own level

        System.out.println("This is executing even if there is exceptions above");

    }
}

//        Hierarchy

//        Throwable --> Exception --> RuntimeException --> All other exception

/*

Throwable
├── Error
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── ...
        └── Exception
    ├── RuntimeException
    │   ├── NullPointerException
    │   ├── ArithmeticException
    │   ├── ArrayIndexOutOfBoundsException
    │   ├── IllegalArgumentException
    │   └── ...
    └── Checked Exceptions
        ├── IOException
        ├── SQLException
        ├── ClassNotFoundException
        ├── FileNotFoundException
        └── ...

*/