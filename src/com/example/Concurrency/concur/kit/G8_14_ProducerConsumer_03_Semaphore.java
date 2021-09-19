package com.example.Concurrency.concur.kit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class G8_14_ProducerConsumer_03_Semaphore {

    /*  Semaphores are often used to restrict the number of threads than can access
        some (physical or logical) resource.
        Before obtaining a resource each thread must acquire a permit from the semaphore,
        guaranteeing that an item is available for use. When the thread has finished
        with the item, the tread returns back to the pool and a permit is returned
        to the semaphore, allowing another thread to acquire that resource.
    */
    
    enum Downloader {
        INSTANCE;
        Semaphore sema = new Semaphore(3, true);   // only 3 permits available;
                                                   // fair mode == true
        void downloadData() {
            try {
                sema.acquire();
                download();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            } finally {
                sema.release();
            }
        }

        void download() {
            System.out.println(Thread.currentThread().getName() + " downloading...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }

    static void goFetch(ExecutorService exec) {
        for (int i = 0; i < 8; i++) {
            exec.execute(() -> Downloader.INSTANCE.downloadData());
        }
        exec.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 8; i++) {
            exec.execute(() -> Downloader.INSTANCE.downloadData());
        }
        
        exec.shutdown();
        
        try {
            exec.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                               // Long.MAX_VALUE == waiting forever            
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        
        System.out.println("Download finished!");

    }
}

