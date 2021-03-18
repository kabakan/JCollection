package com.example.thread.volatiles;

public class VolatileDemo {
   // static int i;
    volatile static int i;

    public static void main(String[] arg) {
        new MyThreadWrite().start();
        new MyThreadRead().start();
    }

    static class MyThreadWrite extends Thread{
        @Override
        public void run(){
            while (i < 5) {
                System.out.println("increment i to :"+(++i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class MyThreadRead extends Thread{
        @Override
        public void run(){
            int LocalVar = i;
            while (LocalVar < 5) {
                if (LocalVar != i) {
                    System.out.println("new value is to :" + i);
                    LocalVar = i;
                }
            }
        }
    }
}
