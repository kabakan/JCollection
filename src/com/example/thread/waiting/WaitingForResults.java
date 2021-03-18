package com.example.thread.waiting;

/**
 * Created by Kanat KB on 09.10.2017.
 */

import java.util.concurrent.*;

public class WaitingForResults {

}

class CheckResults {
    private static int counter = 0;

    public CheckResults() {
        System.out.println("CheckResults() !");
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) CheckResults.counter++;
            });

            result.get(10, TimeUnit.SECONDS);

            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}