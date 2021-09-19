package com.ocp_8.chapter09NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Kanat KB on 24.10.2017.
 * 18. Assuming the directories and files referenced here all exist and are accessible within the file
 * system, what is the result of the following code?
 * <p>
 * 18. D. The code compiles and runs without issue, so F is incorrect. The one thing to notice
 * about these paths is that they represent the same path within the file system. Therefore,
 * isSameFile() would return true and B and C are incorrect. The second output is false,
 * because Path.equals() does not resolve the path within the file system, so A is incorrect.
 * Finally, the normalized paths are equals(), since all extra symbols have been removed;
 * therefore D is correct and E is incorrect.
 * <p>
 * A. true true true
 * B. false false false
 * C. false true false
 * D. true false true    ***
 * E. true false false
 * F. The code does not compile.
 */
public class Test18 {
    public static void main(String[] arg) throws IOException {
        Path path1 = Paths.get("/temp/./").resolve(Paths.get("data.txt"));
        Path path2 = new File("/temp/././dir2/../data.txt").toPath();
        System.out.print(Files.isSameFile(path1, path2));
        System.out.print(" " + path1.equals(path2));
        System.out.print(" " + path1.normalize().equals(path2.normalize()));
    }
}
