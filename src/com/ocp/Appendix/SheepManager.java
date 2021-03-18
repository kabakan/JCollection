package com.ocp.Appendix;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
/**
 * Created by Kanat KB on 04.11.2017.
 */
public class SheepManager {
    private int sheepCount = 0;
    private Lock lock = new ReentrantLock();
    private void incrementAndReport() {
        try {
            lock.lock();
            System.out.println(" P" + (++sheepCount));
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if (service != null) service.shutdown();
        }
    }
}