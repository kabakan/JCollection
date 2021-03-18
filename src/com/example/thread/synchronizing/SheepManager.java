package com.example.thread.synchronizing;

/**
 * Created by Kanat KB on 09.10.2017.
 */

import java.util.concurrent.*;

public class SheepManager {
    private int sheepCount = 0;

    private void incrementAndReport() {
        System.out.println((++sheepCount) + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);

            SheepManager manager = new SheepManager();

            System.out.println("--------Test1-------");
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());

            System.out.println("------synchronized------");
            for (int i = 0; i < 10; i++) {
                synchronized (manager) {
                    service.submit(() -> manager.incrementAndReport());
                }
            }

        } finally {
            if (service != null) service.shutdown();
        }
    }
}


class SheepManagerTwo {
    private int sheepCount = 0;

    private void incrementAndReport() {
        synchronized (this) {
            System.out.print((++sheepCount) + " ");
        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManagerTwo manager = new SheepManagerTwo();
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if (service != null) service.shutdown();
        }
    }
}