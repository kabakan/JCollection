package com.ocp.Appendix.exam;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
/**
 * Created by Kanat KB on 04.11.2017.
 *
 * 18. A,B,C,D. The application compiles without issue so E, F, and G are incorrect. The problem
 with this code is that none of the locks that are acquired are ever released. Since the
 executor service is pooled, the requests could come in any order, so A and B are both possible
 outputs and therefore are correct answers. C is also possible, because Finished could
 be outputted before any of the threads have requested their first lock. Since the tasks could
 be processed in any order and none of the locks are released, the write lock request will
 hang indefinitely if any read lock requests have been granted and vice versa, making D a
 correct answer. H is incorrect, since there is nothing in the code that will produce a runtime
 exception
 *
 * A. It prints Got Read Lock!
 B. It prints Got Write Lock!  ***
 C. It prints Finished.        ***
 D. It hangs indefinitely at runtime.
 E. The code will not compile because of line m1.
 F. The code will not compile because of line m2.
 G. The code will not compile because of line m3.
 H. It throws an exception at runtime.
 */
public class Test18 {
}
class ManageData {
    public static void main(String[] args) throws Exception {
        ExecutorService service = null;
        try {
            ReadWriteLock readWriteLock = new ReentrantReadWriteLock(); // m1
            service = Executors.newFixedThreadPool(20);
            service.submit(() -> {
                readWriteLock.writeLock().lock(); // m2
                System.out.println("Got Write Lock!");
            });
            for (int i = 0; i < 10; i++) {
                service.submit(() -> {
                    readWriteLock.readLock().lock(); // m3
                    System.out.println("Got Read Lock!");
                });
            }
        } finally {
            if (service != null) service.shutdown();
        }
        System.out.print("Finished");
    }
}