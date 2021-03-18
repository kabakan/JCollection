package com.ocp.chapter06Exception;

/**
 * Created by Kanat KB on 07.10.2017.
 * <p>
 * 5. What is the output of the following code?
 * <p>
 * 5. C. After opening both resources in the try-with-resources statement, T is printed. Then the
 * try-with-resource completes and closes the resources in reverse order from which they were
 * opened. After W is printed, an exception is thrown. However, the remaining resource is still
 * closed and D is printed. The exception thrown is then caught and E is printed. Last, the
 * finally block is run, printing F. Therefore the answer is TWDEF.
 * <p>
 * A. TWF
 * B. TWDF
 * C. TWDEF   ***
 * D. TWF followed by an exceptio
 * E. TWDF followed by an exception
 * F. TWEF followed by an exception
 * G. The code does not compile.
 */

import java.io.*;

public class Test05 {
}

class AutocloseableFlow {
    static class Door implements AutoCloseable {
        public void close() {
            System.out.print("D");
        }
    }

    static class Window implements Closeable {
        public void close() {
            System.out.print("W");
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        try (Door d = new Door(); Window w = new Window()) {
            System.out.print("T");
        } catch (Exception e) {
            System.out.print("E");
        } finally {
            System.out.print("F");
        }
    }
}