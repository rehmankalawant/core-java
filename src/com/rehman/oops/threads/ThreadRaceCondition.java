package com.rehman.oops.threads;

class Counter {
    int count;

//    synchronized
//    This keyword make sure that this method must be handled by the thread one at once

//    Like if t1-thread is having count-method
//    It make sure that t1-thread must not have it for execution

//    If we didn't attach the synchronized keyword , output-bug may happen , unexpected output may come

    public synchronized void increament() {
        count++;
    }
}

public class ThreadRaceCondition {

    public static void main(String[] args) throws InterruptedException {

        Counter cn = new Counter();

        Runnable obj1 = () -> {


            for (int i = 1; i <= 100; i++) {
                cn.increament();
            }
        };
        Runnable obj2 = () -> {


            for (int i = 1; i <= 100; i++) {
                cn.increament();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

//        If we don't do t1.join(); , the output will be of initial or of in-middle
//        Not of final

//        Because with t1.start() you only tells the JVM to start the execution, and thats asynchronous program
//        It will directly jump to the printing statement
//        Wait for both threads to finish using join().
//        So the statement t1.join() , make the below await for result

        t1.join();
        t2.join();

        System.out.println(cn.count);

    }
}
