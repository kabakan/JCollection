package com.ocp_8.chapter07Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Kanat KB on 12.10.2017.
 * 3. Which lines need to be changed to make the code compile? (Choose all that apply.)
 * <p>
 * A. It compiles and runs without issue.
 * B. Line w1 ***
 * C. Line w2
 * D. Line w3
 * E. Line w4
 * F. It compiles but throws an exception at runtime.
 */
public class Test03 {
    public static void main(String[] args) {
        try {
            ExecutorService service = Executors.newSingleThreadScheduledExecutor();
           /* service.scheduleWithFixedDelay(() -> { // w1
                System.out.println("Open Zoo");
                return null; // w2
            }, 0, 1, TimeUnit.MINUTES);
            Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
            System.out.println(result.get()); // w4 */
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
