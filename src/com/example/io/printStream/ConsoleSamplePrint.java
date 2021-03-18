package com.example.io.printStream;

import java.io.*;

/**
 * Created by Kanat KB on 19.10.2017.
 */
public class ConsoleSamplePrint {
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console not available");
        } else {
            console.writer().println("Welcome to Our Zoo!");
            console.format("Our zoo has 391 animals and employs 25 people.");
            console.writer().println();
            console.printf("The zoo spans 128.91 acres.");
        }
    }
}
