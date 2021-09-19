package com.ocp_8.chapter06Exception;

/**
 * Created by Kanat KB on 07.10.2017.
 * <p>
 * 16. What is the output of the following?
 * <p>
 * 16. C. The exception inside the try block becomes the primary exception since it is
 * thrown first. Then two suppressed exceptions are added to it when trying to close the
 * AutoCloseable resources.
 * <p>
 * A. rain 0
 * B. rain 1
 * C. rain 2   ***
 * D. show 0
 * E. snow 1
 * F. snow 2
 */
public class Test16 {
}

class SnowStorm {
    static class Walk implements AutoCloseable {
        public void close() {
            throw new RuntimeException("snow");
        }
    }

    public static void main(String[] args) {
        try (Walk walk1 = new Walk(); Walk walk2 = new Walk();) {
            throw new RuntimeException("rain");
        } catch (Exception e) {
            System.out.println(e.getMessage()
                    + " : " + e.getSuppressed().length);
        }
    }
}