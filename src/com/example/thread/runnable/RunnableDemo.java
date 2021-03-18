package com.example.thread.runnable;

/**
 * Created by Kanat KB on 09.10.2017.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        System.out.println("end");


        new PrintData().run();
    }
}

class PrintData implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++)
            System.out.println("Printing record: " + i);
    }

}

class ReadInventoryThread extends Thread {
    public void run() {
        System.out.println("Printing zoo inventory");
    }
}