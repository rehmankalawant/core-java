package com.rehman.oops.threads;

//  Threads
//  Thread is the smallest unit of execution within a program that allows an application to perform multiple tasks concurrently
//  Every Java application has at least one thread, known as the main thread, which automatically runs the main() method


//  1
//  extend the class with thread-class

class A extends Thread {

    //    2
    //    Must have the run method
    //    A thread class must have run-method for execution , else it will not run this thread
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.print("Thread A | ");
        }
    }
}

class B extends Thread {

    //    2
    //    Must have the run method
    //    A thread class must have run-method for execution , else it will not run this thread
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.print("Thread B | ");
        }
    }
}

public class ThreadsInJava {

    public static void main(String[] args) {

//        3
//        Create object for the classes

        A obj1 = new A();
        B obj2 = new B();

//        4
//        To invoke the thread always use .start
//        To invoke the run() , use obj.start();

        obj1.start();
        obj2.start();

    }
}
