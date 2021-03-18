package com.ocp.chapter09NIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Kanat KB on 24.10.2017.
 * 8. What is the output of the following code?
 * <p>
 * 8. A. The code compiles and runs without issue, so E is incorrect. For this question, you have
 * to remember two things. First, the resolve() method does not normalize any path symbols,
 * so C and D are not correct. Second, calling resolve() with an absolute path as a
 * parameter returns the absolute path, so A is correct and B is incorrect.
 * <p>
 * A. /pets/../cat.txt/./dog.txt    ***
 * /pets/../cat.txt
 * B. /pets/../cat.txt/./dog.txt
 * ./dog.txt/pets/../cat.txt
 * C. /cats.txt
 * /dog.txt
 * D. /cats.txt/dog.txt
 * /cat.txt
 * E. It compiles but throws an exception at runtime.
 */
public class Test08 {
    public static void main(String[] arg) throws IOException {
        Path path1 = Paths.get("/temp/../data.txt");
        Path path2 = Paths.get("./data.txt");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));
    }
}
