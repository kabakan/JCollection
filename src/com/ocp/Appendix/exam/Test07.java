package com.ocp.Appendix.exam;
import java.util.concurrent.locks.*;
import java.util.stream.IntStream;
/**
 * Created by Kanat KB on 04.11.2017.
 * 7. A,B,C,H. The application compiles without issue, so E, F, and G are incorrect. The tryLock()
 method attempts to obtain a lock but returns immediately with a value of false if the lock cannot
 be acquired. The application does not check whether or not the lock was actually acquired;
 therefore the call to unlock() on w3 would produce an IllegalMonitorStateException at
 runtime if a thread that did not get a lock attempted to release it, and H is correct. The answer
 A is also correct, because the first thread to run will obtain the lock without issue. This behavior
 is indeterminate, though. If the threads are processed in order, with all of the threads able to
 obtain the lock, then the code will complete without throwing an exception, making B and C
 also correct. Finally, D is incorrect since tryLock() returns immediately if it cannot obtain the
 lock. Note that this code does not use a try/finally block to ensure that the unlock() method
 is called whenever a lock is obtained. Although using try/finally is strongly recommended, it
 is not required for the code to compile and run.
 *
 * A. It prints Got Lock!at least one time.
 */
public class Test07 {
}
class AcquireLocks {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        IntStream.iterate(1, i -> 1).limit(10).parallel().forEach(x -> { // w1
            lock.tryLock(); // w2
            System.out.println("Got Lock!");
            lock.unlock(); // w3
        });
        System.out.print("Finished");
    }
}