package com.example.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * Created by Kanat KB on 21.10.2017.
 */
public class ImprovingAccess {
    public static void main(String[] arg) {
        getReading();
        getModifying();
    }

    public static void getReading() {
        System.out.println("----------getReading()----------");
        try {
            Path path = Paths.get("./temp/data/data.txt");
            BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("Is path a directory? " + data.isDirectory());
            System.out.println("Is path a regular file? " + data.isRegularFile());
            System.out.println("Is path a symbolic link? " + data.isSymbolicLink());
            System.out.println("Path not a file, directory, nor symbolic link? " + data.isOther());
            System.out.println("Size (in bytes): " + data.size());
            System.out.println("Creation date/time: " + data.creationTime());
            System.out.println("Last modified date/time: " + data.lastModifiedTime());
            System.out.println("Last accessed date/time: " + data.lastAccessTime());
            System.out.println("Unique file identifier (if available): " + data.fileKey());

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getModifying() {
        System.out.println("----------getModifying()----------");
        try {
            Path path = Paths.get("./temp/data/data.txt");
            BasicFileAttributeView view =
                    Files.getFileAttributeView(path, BasicFileAttributeView.class);
            BasicFileAttributes data = view.readAttributes();
            FileTime lastModifiedTime = FileTime.fromMillis(data.lastModifiedTime().toMillis() + 10_000);
            view.setTimes(lastModifiedTime, null, null);
            System.out.println("Size (in bytes): " + data.size());
            System.out.println("Creation date/time: " + data.creationTime());
            System.out.println("Last modified date/time: " + data.lastModifiedTime());
            System.out.println("Last accessed date/time: " + data.lastAccessTime());
            System.out.println("Unique file identifier (if available): " + data.fileKey());

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
