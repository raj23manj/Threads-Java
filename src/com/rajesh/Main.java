package com.rajesh;

import static com.rajesh.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello World!");
        // implementing via sub-classing Thread class
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("=== Another Thread ===");

        // invoke run method to start thread
        // start invokes the run method

        //try {
        anotherThread.start(); // prints hello from another thread
         // wrong
        //anotherThread.run(); // prints hello from main

            /*
             *  this throws an exception java.lang.IllegalThreadStateException
             * */
//            anotherThread.start();
//        } catch(IllegalThreadStateException e) {
//            System.out.println(e);
//        }

        // Anonymous Class Thread Creation
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello From Anonymous Class Thread");
            }
        }.start();

        // implementing the interface
        // normal way
//        Thread myRunnableTHread = new Thread(new MyRunnable());
//        myRunnableTHread.start();
        // anonymous class
        // this preffered way
        Thread myRunnableTHread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                //super.run(); calls MyRunnable classes run
                System.out.println(ANSI_RED + "Hello from MyRunnables implementation Anonymous");
            }
        });

        myRunnableTHread.start();

        System.out.println(ANSI_PURPLE + "Hello World again main thread!");

        /*
        * o/p varies
        * 1) Hello World!
             Hello World again main thread!
             Hello from another thread
          2) Hello World!
             Hello from another thread
             Hello World again main thread!

        * Not allowed to start the instance of thread more than once, if needed create a sub class
        * of Thread Class and run multiple instances
        * */
    }
}
