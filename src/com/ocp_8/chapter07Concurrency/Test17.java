package com.ocp_8.chapter07Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Kanat KB on 12.10.2017.
 * 17. Assuming 100 milliseconds is enough time for the tasks submitted to the thread executor to
 * complete, what is the result of executing the following program? (Choose all that apply.)
 * <p>
 * <p>
 * A. It outputs 100 99.
 * B. It outputs 100 100.   ***
 * C. The output cannot be determined ahead of time.
 * D. The code will not compile because of line w1.
 * E. The code will not compile because of line w2.
 * F. The code will not compile because of line w3.
 * G. It compiles but throws an exception at runtime.
 */
public class Test17 {
}

class SheepManager {
    private static AtomicInteger sheepCount1 = new AtomicInteger(0); // w1
    private static int sheepCount2 = 0;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor(); // w2
            for (int i = 0; i < 100; i++)
                service.execute(() ->
                        {
                            sheepCount1.getAndIncrement();
                            sheepCount2++;
                        }
                ); // w3
            Thread.sleep(100);
            System.out.println(sheepCount1 + " " + sheepCount2);
        } finally {
            if (service != null) service.shutdown();
        }
    }
}