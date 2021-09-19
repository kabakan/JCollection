package com.example.Concurrency.concur.kit;

//import
// counter should be 20000

public class G8_05_Synchro {

    private static int counter = 0;
    static Runnable runner = () -> {
        for (int i = 0; i < 10000; i++)
            increment();
    };

//    synchronized
    private static void increment(){
        
//        //....
//        synchronized(G8_05_Synchro.class){
            counter++;
//        }
//        //...
        
    }
    
    private static void process() {
        Thread t1 = new Thread(runner);
        Thread t2 = new Thread(runner);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }
    
    public static void main(String[] args) {
        process();
        System.out.println("Counter = " + counter);
    }
}
