package com.example.exception;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

/**
 * Created by Kanat KB on 01.11.2017.
 */
public class MemoryException extends Throwable {
    private static final int MEGABYTE = (1000000000*10000000);
    public static void runOutOfMemory() {
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        for (int i=1; i <= 100; i++) {
            try {
                byte[] bytes = new byte[MEGABYTE*5000];
            } catch (Exception e) {
                e.printStackTrace();
            } catch (OutOfMemoryError e) {
                MemoryUsage heapUsage = memoryBean.getHeapMemoryUsage();
                long maxMemory = heapUsage.getMax() / MEGABYTE;
                long usedMemory = heapUsage.getUsed() / MEGABYTE;
                System.out.println(i+ " : Memory Use :" + usedMemory + "M/" + maxMemory + "M");
            }
        }
    }
    public static void runOutOfMemory2() {
        try {
            int MEGABYTE = (1000000000 * 10000000);
            MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
            for (int i = 1; i <= 100; i++) {
                byte[] bytes = new byte[MEGABYTE * 5000];
            }
        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
            ex.printStackTrace();
        }
    }
    public static void main(String args[]) {
        runOutOfMemory2();
    }
}
