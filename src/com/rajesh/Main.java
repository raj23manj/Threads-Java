package com.rajesh;

import static com.rajesh.ThreadColor.ANSI_GREEN;
import static com.rajesh.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello World!");

        Thread anotherThread = new AnotherThread();

        // invoke run method to start thread
        // start invokes the run method

        //try {
            anotherThread.start();

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
