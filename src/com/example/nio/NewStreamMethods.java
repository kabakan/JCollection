package com.example.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 21.10.2017.
 */
public class NewStreamMethods {
    public static void main(String[] arg) {
        /*getPathStream();
        getSearchingDir();
        getPrintingFile();
        getPrintingStartWith(); */
        getLamdaSearch();
    }

    public static void getPathStream() {
        System.out.println("---------- getPathStream()----------");
        Path path = Paths.get("./temp/data/");
        try {
            Files.walk(path)
                    .filter(p -> p.toString().endsWith(".txt"))
                    .forEach(System.out::println);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }


    public static void getSearchingDir() {
        System.out.println("----------getSearchingDir(()----------");
        try {
            Path path = Paths.get("./temp/data");
            Files.list(path)
                    .filter(p -> !Files.isDirectory(p))
                    .map(p -> p.toAbsolutePath())
                    .forEach(System.out::println);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getPrintingFile() {
        System.out.println("----------getPrintingFile(()----------");
        Path path = Paths.get("./temp/data/data.txt");
        try {
            Files.lines(path).forEach(System.out::println);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getPrintingStartWith() {
        System.out.println("----------getPrintingStartWith(()----------");
        Path path = Paths.get("./temp/data/data.txt");
        try {
            System.out.println(Files.lines(path)
                    .filter(s -> s.startsWith("WARN "))
                    .map(s -> s.substring(5))
                    .collect(Collectors.toList()));
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getLamdaSearch() {
        System.out.println("----------getLamdaSearch(()----------");
        Path path = Paths.get("./temp/data");
        long dateFilter = 1420070400000l;
        try {
            Stream<Path> stream = Files.find(path, 10,
                    (p, a) -> p.toString().endsWith(".txt")
                            && a.lastModifiedTime().toMillis() > dateFilter);
            stream.forEach(System.out::println);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
       /*public static void getFileSystem() {
     System.out.println("----------getFileSystem(()----------");
        try {


        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }*/

}
