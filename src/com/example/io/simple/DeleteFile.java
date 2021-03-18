package com.example.io.simple;

import java.io.File;

/**
 * Created by Kanat KB on 19.10.2017.
 */
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("C:\\KANATKB\\soft\\JCollection\\temp\\data\\zoo.txt");
        deleteTree(file);
    }

    public static void deleteTree(File file) {
        if (!file.isFile())
            for (File entry : file.listFiles())
                deleteTree(entry);
        else file.delete();
    }

}