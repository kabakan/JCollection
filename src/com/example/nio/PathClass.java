package com.example.nio;

import java.io.File;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Kanat KB on 21.10.2017.
 */
public class PathClass {
    public static void main(String[] arg) {
        getPaths();
        getURI();
        getFileSystem();
        getLegacyFile();
    }

    public static void getPaths() {
        System.out.println("----------getPaths()----------");
        Path path1 = Paths.get("pandas/cuddly.png");
        Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");
        Path path3 = Paths.get("/home/zoodirector");
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(path3);
    }

    public static void getURI() {
        try {
            System.out.println("----------getURI()----------");
            Path path1 = Paths.get(new URI("file://pandas/cuddly.png")); // THROWS EXCEPTION // AT RUNTIME
            Path path2 = Paths.get(new URI("file:///c:/zoo-info/November/employees.txt"));
            Path path3 = Paths.get(new URI("file:///home/zoodirectory"));
            System.out.println(path1);
            System.out.println(path2);
            System.out.println(path3);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getFileSystem() {
        try {
            System.out.println("----------getFileSystem(()----------");
            Path path1 = FileSystems.getDefault().getPath("pandas/cuddly.png");
            Path path2 = FileSystems.getDefault().getPath("c:", "zooinfo", "November",
                    "employees.txt");
            Path path3 = FileSystems.getDefault().getPath("/home/zoodirector");
            System.out.println(path1);
            System.out.println(path2);
            System.out.println(path3);

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getLegacyFile() {
        try {
            System.out.println("----------getLegacyFile(()----------");
            File file = new File("pandas/cuddly.png");
            Path path = file.toPath();
            System.out.println(path);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
