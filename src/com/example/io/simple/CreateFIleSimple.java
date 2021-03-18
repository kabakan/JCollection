package com.example.io.simple;

import java.io.File;

/**
 * Created by Kanat KB on 19.10.2017.
 */
public class CreateFIleSimple {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\KANATKB\\zoo12.txt");
            System.out.println(file.exists());
        } catch (Exception ex) {
            System.out.println("Err :" + ex.getMessage());
        }
    }
}


