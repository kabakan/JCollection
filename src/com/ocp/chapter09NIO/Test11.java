package com.ocp.chapter09NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by Kanat KB on 24.10.2017.
 * For the copy() method shown here, assume that the source exists as regular file and that
 * the target does not. What is the result of the following code?
 * <p>
 * 11. A. The code compiles and runs without issue, so C, D, E, and F are incorrect. Even though
 * the file is copied with attributes preserved, the file is considered a separate file, so the output
 * is false and A is correct and B is incorrect. Remember, isSameFile()returns true only if
 * the files pointed to in the file system are the same, without regard to the file contents.
 * <p>
 * A. It will output false.      ***
 * B. It will output true.
 * C. It does not compile because of line k1.
 * D. It does not compile because of line k2.
 * E. It does not compile because of line k3.
 * F. It compiles but throws an exception at runtime.
 */
public class Test11 {
    public static void main(String[] arg) throws IOException {
        Path path1 = Paths.get("./data.txt").normalize(); // k1
        Path path2 = Paths.get("data1.txt");
        Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES); //k2
        System.out.println(Files.isSameFile(path1, path2)); //k3
    }
}
