package com.rajesh;

import static com.rajesh.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{
   @Override
   public void run() {
       System.out.println(ANSI_BLUE +"Hello from " + currentThread().getName());

       try {
           Thread.sleep(3000);
           // Exception will be thrown if any other thread interrupts
       }catch(InterruptedException e) {
           System.out.println(ANSI_BLUE + "Another Thread Woke Me Up");
       }

       System.out.println(ANSI_BLUE + "3 seconds passed i'm awake");
   }
}
