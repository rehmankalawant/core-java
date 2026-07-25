package com.rehman.oops.threads;

//  As we know a thread implements Runnable interface / class
//  So we can directly implement that also

//  1
//  implements Runnable

class E implements Runnable {

//    2
//    The run method belongs to Runnable not of thread , so no need to change

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("Thread A | ");

            try {
                Thread.sleep(100);
            } catch (InterruptedException err) {
                System.out.println(err);
            }
        }
    }
}

class F implements Runnable {

    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.print("Thread B | ");

            try {
                Thread.sleep(100);
                // iv --> Waiting // When we keep thread on hold
                // Also have `wait()` than `sleep()` , but to return for execution again we use `notify()` it goes to Runnable-State not the Running-State

            } catch (InterruptedException err) {
                System.out.println(err);
            }
        }
    }
}

public class ThreadWithRunnable {

    public static void main(String[] args) {

//        4
//        We can create reference of type and object of another type
//        So we can create referenceOfRunnableType and objectOfOurClassType

        Runnable obj1 = new E();
        Runnable obj2 = new F();

//        ! important
//        We can convert the above part to lambda-function
//        Because the Runnable is a @FunctionalInterface

//        3
//        Create a thread

//        So to make a thread -
//        Thread have a constructor with parameter , which accepts Runnable reference value
//        public Thread(Runnable task) {    this(null, null, 0, task, 0);   }

//        Thread t1 = new Thread();
//        Thread t2 = new Thread();

//        5
//        Pass the object in the constructor


        Thread t1 = new Thread(obj1);       // i --> New //
        Thread t2 = new Thread(obj2);


//        6
//        Start the Thread Execution

        t1.start();     // ii --> Runnable //
        t2.start();

//         iii --> Running // When thread is running on CPU

//        v  --> Dead state // Execution stopped

    }
}
