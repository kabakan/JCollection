package com.example.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * Created by Kanat KB on 07.10.2017.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        // Test1();
        Test2();
    }

    public static void Test1() {
        System.out.println("------Test1-------");
        try {
            Path path = Paths.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);
        } catch (Exception e) { // BAD approach
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void Test2() {
        System.out.println("------Test2-------Using Multi-catch");
        try {
            Path path = Paths.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);
        } catch (DateTimeParseException | IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
