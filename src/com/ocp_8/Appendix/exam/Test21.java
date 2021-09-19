package com.ocp_8.Appendix.exam;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
/**
 * Created by Kanat KB on 04.11.2017.
 *
 * 21. A,C,D. The application compiles without issue, so E and F are incorrect. The most important
 thing to notice is that the goSwimming() method performs two lock requests, via
 lock() and tryLock(), but it has only one call to unlock(). Recall that for Reentrant
 locks, a thread must call unlock() the same number of times it locks the object, or else
 the lock will not be released. Therefore, only one thread is able to acquire the lock and
 print Swim! For these reasons, A is correct and B is incorrect. C is also correct, since the
 lock requests are performed on separate threads from the main execution thread. Since the
 lock is never released by the first thread, the second thread will hang indefinitely, making
 D a correct answer. Finally, H is incorrect, because this code does not throw any exceptions
 at runtime.
 *
 * A. It prints Swim!at least one time.
 B. It prints Swim! exactly twice.  ***
 C. It prints Tasks Complete.       ***
 D. It hangs indefinitely at runtime.
 E. The code will not compile because of line y1.
 F. The code will not compile because of line y2.
 G. It throws an exception at runtime.
 */
public class Test21 {
}
class BeachManager {
    public static void goSwimming(Lock lock) {
        try {
            lock.lock(); // y1
            if(lock.tryLock()) { // y2
                System.out.println("Swim!");
            }
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        ExecutorService service = null;
        try {service = Executors.newFixedThreadPool(2);
            for(int i=0; i<2; i++)
                service.submit(() -> goSwimming(lock));
        } finally {
            if (service != null) service.shutdown();
        }
        System.out.print("Tasks Complete");
    }
}