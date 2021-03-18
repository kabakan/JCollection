package com.example.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

/**
 * Created by Kanat KB on 21.10.2017.
 */
public class FileAttributes {
    public static void main(String[] arg) {
        getAttributes();
    }

    public static void getAttributes() {
        System.out.println("----------getAttributes()----------");
        try {
            System.out.println("isDirectory: " + Files.isDirectory(Paths.get("/temp/data/data.txt")));
            System.out.println("isRegularFile: " + Files.isRegularFile(Paths.get("/data/data.txt")));
            System.out.println("isSymbolicLink: " + Files.isSymbolicLink(Paths.get("/data/S")));
            System.out.println("isReadable: " + Files.isReadable(Paths.get("/temp/data/data.txt")));
            System.out.println("isExecutable: " + Files.isExecutable(Paths.get("/temp/data/data.txt")));
            System.out.println("Size: " + Files.size(Paths.get("./temp/data/data.txt")));

            final Path path = Paths.get("./temp/data/data.txt");
            System.out.println("getLastModifiedTime: " + Files.getLastModifiedTime(path).toMillis());

            Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()));
            System.out.println("getLastModifiedTime: " + Files.getLastModifiedTime(path).toMillis());

            // Read owner of file
            Path path1 = Paths.get("./temp/data/data.txt");
            System.out.println("getOwner: " + Files.getOwner(path1).getName());
// Change owner of file
            UserPrincipal owner = path1.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("jane");
            Files.setOwner(path1, owner);
// Output the updated owner information
            System.out.println("getOwner: " + Files.getOwner(path).getName());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
