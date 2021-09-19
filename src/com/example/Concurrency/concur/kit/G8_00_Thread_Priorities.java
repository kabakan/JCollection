package com.example.Concurrency.concur.kit;

/*
    From Java Concurrency in Practice:
    "Avoid the temptation to use thread priorities, since they increase platform
    dependence and can cause liveness problems. Most concurrent applications can
    use the default priority for all threads".

    + println() is synchronized internally.

 */
public class G8_00_Thread_Priorities {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (true) {
                    if (count % 100 == 0) {
                        System.out.println(
                                Thread.currentThread().getName()
                                + " : " + Thread.currentThread().getPriority());
                    }
                    count++;
                }
            }

        };
        Thread th1 = new Thread(r, "th1");
        Thread th2 = new Thread(r, "th2");
        th1.setPriority(1);
        th2.setPriority(10);
        th1.start();
        th2.start();
    }

}
