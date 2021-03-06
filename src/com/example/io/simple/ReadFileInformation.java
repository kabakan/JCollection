package com.example.io.simple;

import java.io.File;

/**
 * Created by Kanat KB on 19.10.2017.
 */
public class ReadFileInformation {
    public static void main(String[] args) {
        File file = new File("C:\\KANATKB\\soft\\JCollection\\temp\\data\\zoo.txt");
        System.out.println("File Exists: " + file.exists());
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("File size: " + file.length());
                System.out.println("File LastModified: " + file.lastModified());
            } else {
                for (File subfile : file.listFiles()) {
                    System.out.println("\t" + subfile.getName());
                }
            }
        }
    }
}
