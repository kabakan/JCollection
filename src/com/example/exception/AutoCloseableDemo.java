package com.example.exception;

/**
 * Created by Kanat KB on 07.10.2017.
 */
public class AutoCloseableDemo {

}

class TurkeyCage implements AutoCloseable {
    public void close() {
        System.out.println("Close gate");
    }

    public static void main(String[] args) {
        try (TurkeyCage t = new TurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }
}

