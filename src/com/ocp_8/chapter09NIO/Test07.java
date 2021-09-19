package com.ocp_8.chapter09NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Kanat KB on 24.10.2017.
 * 7. If the current working directory is /zoo, and the path /zoo/turkey does not exist, then
 * what is the result of executing the following code? (Choose all that apply.)
 * <p>
 * 7. F. The code compiles without issue, so D and E are incorrect. The method Files.isSame-
 * File() first checks to see if the Path values are the same in terms of equals(). Since the
 * first path is relative and the second path is absolute, this comparison will return false,
 * forcing isSameFile() to check for the existence of both paths in the file system. Since we
 * know /zoo/turkey does not exist, a NoSuchFileException is thrown and F is the correct
 * answer. A, B, and C are incorrect since an exception is thrown at runtime.
 * <p>
 * A. The code compiles and runs without issue, but it does not create any directories.
 * B. The directory /zoo/turkey is created.
 * C. The directory /zoo/turkey/info is created.
 * D. The code will not compile because of line x1.
 * E. The code will not compile because of line x2.
 * F. It compiles but throws an exception at runtime.    ***
 */
public class Test07 {
    public static void main(String[] arg) throws IOException {
        Path path = Paths.get("./temp");
        if (Files.isSameFile(path, Paths.get("/temp/data"))) // x1
            Files.createDirectory(path.resolve("info")); // x2
        System.out.println("true");
    }
}
