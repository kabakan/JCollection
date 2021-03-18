package com.example.io.stream;

import java.io.*;
import java.util.*;

/**
 * Created by Kanat KB on 19.10.2017.
 */
public class CopyTextFileSample {
    public static List<String> readFile(File source) throws IOException {
        List<String> data = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String s;
            while ((s = reader.readLine()) != null) {
                data.add(s);
            }
        }
        return data;
    }

    public static void writeFile(List<String> data, File destination) throws
            IOException {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(destination))) {
            for (String s : data) {
                writer.write(s);
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File source = new File("Zoo.csv");
        File destination = new File("ZooCopy.csv");
        List<String> data = readFile(source);
        for (String record : data) {
            System.out.println(record);
        }
        writeFile(data, destination);
    }
}
