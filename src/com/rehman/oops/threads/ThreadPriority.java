package com.rehman.oops.threads;

//  Thread Priority
//  We can suggest the schedular the priority of our suggest
//  But it is not mandotory to the schedular to hear from you about the priority
//  He can do some task scheduling by himself by applying some algorithm

//  Priority vary between 1 - 10
//  1 --> least priority , 5 --> normal (default) , 10 --> highest priority


class C extends java.lang.Thread {

    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.print("Thread A | ");

            try {
                Thread.sleep(100);
            } catch (InterruptedException err) {
                System.out.println(err);
            }
        }
    }
}

class D extends java.lang.Thread {

    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.print("Thread B | ");

//            So to avoid the cpu read next thread and execute it by avoiding our thread-priority-preference
//            We just can do this
//            We can ask our thread to wait (mili-second)

            try {
                Thread.sleep(100);
            } catch (InterruptedException err) {
                System.out.println(err);
            }
        }
    }
}

public class ThreadPriority {

    public static void main(String[] args) {

        C obj1 = new C();
        D obj2 = new D();

//        We can set the priority

        obj1.setPriority(7);
        obj2.setPriority(Thread.MAX_PRIORITY);

//        Get the priority of the thread

        System.out.println("Priority for obj1 - " + obj1.getPriority());
        System.out.println("Priority for obj1 - " + obj2.getPriority());

//        Calling the thread

        obj1.start();
        obj2.start();

    }
}
