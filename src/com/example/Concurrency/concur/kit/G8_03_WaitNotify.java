package com.example.Concurrency.concur.kit;

/*
    Producer sleeps then wakes up and notifies Consumer.
    Run jVisualVM to observe threads' states 
*/

class G8_03_ProducerConsumer_00_WaitNotify {

    static class ProducerConsumer {

        volatile private boolean isSleepy = true;

        public synchronized void consume() {

            // keep waiting if nothing is produced to consume
            while (isSleepy) {
                try {
                    wait(); // give up lock and wait
//                    System.out.println(Thread.currentThread().getState());
                }catch (InterruptedException ie) {
                    System.out.println(ie);
                }
            }
            System.out.println("... and " + Thread.currentThread().getName() + " consumed!");
        }

        public synchronized void produce() {
            System.out.println(Thread.currentThread().getName() + " produced...");
            isSleepy = false;                    // okay, now Consumer may consume
//---- uncomment this LOC to wake up a Consumer
//            notify();                    // notify waiting threads to resume

        }
    }

    public static void main(String[] args) {

        ProducerConsumer proc = new ProducerConsumer();

        Thread prod = new Thread(() -> {
            int delay = 15000;
            System.out.print("Producer sleeps for " + delay + " ms ... ");
            try {
                Thread.sleep(delay);
                System.out.println("Producer " + Thread.currentThread().getName() + " awoke!");
                proc.produce();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        });

        Thread cons = new Thread(() -> proc.consume());

        prod.start();
        cons.start();

        try{
            prod.join();
            cons.join();
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
}
