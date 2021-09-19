package com.example.Concurrency.concur.kit;

// Demonstrates the use of the 'volatile' keyword

public class G8_04_VolatileDemo {

//    volatile   // uncomment this LOC to achieve correct performance
    private static int count = 0;

    static class ChangeMaker extends Thread {
        @Override
        public void run(){
            while(count < 5){
                System.out.println("Incrementing from " + count + " to " + ++count);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ie){
                    System.out.println(ie);
                }
            }
        }
    }

    static class ChangeListener extends Thread {
        @Override
        public void run(){
            int temp = 0;
            while(temp < 5){
                if(temp != count){
                    System.out.println("Change detected! now count = " + count);
                    temp = count;
                }
            }
        }
    }

    public static void main(String[] args) {
        new ChangeMaker().start();
        new ChangeListener().start();
        
    }
}
