package com.example.io.printStream;

import java.io.*;

/**
 * Created by Kanat KB on 19.10.2017.
 */
public class SystemInSample {
    public static void main(String[] args) throws IOException {
        getOldWay();
        getNewWay();
    }

    public static void getOldWay() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String userInput = reader.readLine();
        System.out.println("You entered the following: " + userInput);
    }

    public static void getNewWay() {
        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered the following: " + userInput);
        }
    }
}
