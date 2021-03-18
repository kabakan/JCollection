package com.example.nio;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Kanat KB on 21.10.2017.
 */
public class InteractingFile {
    public static void main(String[] arg) {
        getExists();
        getIsSameFile();
        getCreateDirectory();
        getCopy();
        getIO();
        getWritingFile();
        getReadAllLines();
    }

    public static void getExists() {
        try {
            System.out.println("----------getExists()----------");
            Files.exists(Paths.get("/data/data.txt"));
            Files.exists(Paths.get("/data"));
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getIsSameFile() {
        try {
            System.out.println("----------getIsSameFile()----------");
            System.out.println(Files.isSameFile(Paths.get("/user/Kanat KB"),
                    Paths.get("/user/Kanat KB/temp")));
            System.out.println(Files.isSameFile(Paths.get("/user/Kanat KB/../diag"),
                    Paths.get("/user/monkey")));
            System.out.println(Files.isSameFile(Paths.get("/Kanat KB/./giraffe.exe"),
                    Paths.get("/leaves/giraffe.exe")));
            System.out.println(Files.isSameFile(Paths.get("/flamingo/tail.data"),
                    Paths.get("/cardinal/tail.data")));
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getCreateDirectory() {
        try {
            System.out.println("----------getCreateDirectory()----------");
            Files.createDirectory(Paths.get("C:\\KANATKB\\soft\\JCollection\\temp\\data\\7878"));
            Files.createDirectories(Paths.get("./temp/data/green77"));
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getCopy() {
        try {
            System.out.println("----------getCopy()----------");
            Files.copy(Paths.get(".././data"), Paths.get(".././S"));
            Files.copy(Paths.get("./data/data.txt"),
                    Paths.get("./s/data.txt"));

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getIO() {
        try (InputStream is = new FileInputStream("data.txt");
             OutputStream out = new FileOutputStream("output-data.txt")) {

// Copy stream data to file
            Files.copy(is, Paths.get("C:\\KANATKB\\soft\\JCollection\\temp\\data\\data.txt"));
// Copy file data to stream
            Files.copy(Paths.get("C:\\KANATKB\\soft\\JCollection\\temp\\data\\data\\clown.xsl"), out);


        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }


    public static void getMove() {
        try {
            System.out.println("----------getMove(()----------");
            Files.move(Paths.get("c:\\zoo"), Paths.get("c:\\zoo-new"));
            Files.move(Paths.get("c:\\user\\addresses.txt"),
                    Paths.get("c:\\zoo-new\\addresses.txt"));
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getDeleteIfExists() {
        try {
            System.out.println("----------DeleteIfExists()----------");
            Files.delete(Paths.get("/vulture/feathers.txt"));
            Files.deleteIfExists(Paths.get("/pigeon"));
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getWritingFile() {
        System.out.println("----------getWritingFile(()----------");
        Path path = Paths.get("C:\\KANATKB\\soft\\JCollection\\temp\\data\\data.txt");
        try (BufferedReader reader = Files.newBufferedReader(path,
                Charset.forName("US-ASCII"))) {
            // Read from the stream
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null)
                System.out.println(currentLine);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }


    public static void getReadAllLines() {
        System.out.println("----------getReadAllLines()----------");
        Path path = Paths.get("C:\\KANATKB\\soft\\JCollection\\temp\\data\\data.txt");
        try {
            final List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
