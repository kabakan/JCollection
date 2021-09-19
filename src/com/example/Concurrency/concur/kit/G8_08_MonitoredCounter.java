package com.example.Concurrency.concur.kit;

/* 
 * In this example, 1000 threads increment the counter 1000 times each.
 * The final value of the counter must be 1,000,000, but it is usually less.
 * Observe how the counter does not grow consistently.
 * Why is this happening and how to fix it?
 */
// Also see:
// https://puredanger.github.io/tech.puredanger.com/2009/01/28/java-concurrency-bugs-synchronize-object/


public class G8_08_MonitoredCounter {

    Integer counter = 0;            // to be used for all Solutions
//    final Object monitor = new Object();  // to be added for Solution 3

    class TestThread implements Runnable {

        String threadName;

        public TestThread(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {

//--- Solutions are mutually exclusive
//------- Solution 1:
//                counter++;
//------------------------------------------------

//------- Solution 2:
//                synchronized (counter) {
//                    counter++;
//                    Thread.yield();
//                }
//------------------------------------------------

//------- Solution 3:
//                synchronized (monitor) {
//                    counter++;
//                    Thread.yield();
//                }
//------------------------------------------------
            }
        }   
    }

}
