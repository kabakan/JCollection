package com.example.io.simple;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            File myLogFIle = new File("C:\\KANATKB\\transfer.log");
            if (myLogFIle.exists()) {
                String s = System.lineSeparator() + "New Line!";
                try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(myLogFIle.toPath(), StandardOpenOption.APPEND))) {
                    out.write(s.getBytes());
                } catch (IOException e) {
                    System.err.println(e);
                }
            } else {
                if (myLogFIle.createNewFile()) {
                    System.out.println("File created: " + myLogFIle.getName());
                    System.out.println("Absolute path: " + myLogFIle.getAbsolutePath());
                } else {
                    System.out.println("File already exists.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}