package com.example.thread.improveThread;

/**
 * Created by Kanat KB on 09.10.2017.
 */

import java.util.*;

public class WhaleDataCalculator {
    public int processRecord(int input) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
// Handle interrupted exception
            System.out.println("Err processRecord: " + e.getMessage());
            return 0;
        }
        return input + 1;
    }

    public void processAllData(List<Integer> data) {
        data.stream().map(a -> processRecord(a)).count();
    }

    public static void main(String[] args) {
        WhaleDataCalculator calculator = new WhaleDataCalculator();
// Define the data
        List<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < 4000; i++) data.add(i);
// Process the data
        long start = System.currentTimeMillis();
        calculator.processAllData(data);
        double time = (System.currentTimeMillis() - start) / 1000.0;
// Report results
        System.out.println("\nTasks completed in: " + time + " seconds");
    }
}
