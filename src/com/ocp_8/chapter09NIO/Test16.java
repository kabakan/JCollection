package com.ocp_8.chapter09NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 24.10.2017.
 * 16. Assuming /squid/food-schedule.csv exists as a regular non-empty file that a program
 * has access to read, what is correct about the following code snippet? (Choose all that apply.)
 * <p>
 * 16. F. The code compiles without issue, so B, C, and D are incorrect. The code snippet breaks a
 * file into lines and then further separates the lines by commas using the flatMap() method.
 * The result is printed with one entry on a single line, but all original line breaks and commas
 * from the file are removed; therefore F is correct. Since we are told that the file is non-empty
 * and regular, and the program has access to read it, A and E are incorrect.
 * <p>
 * A. It compiles but may throw an exception at runtime.
 * B. The code will not compile because of line r1.
 * C. The code will not compile because of line r2.
 * D. The code will not compile because of line r3.
 * E. It may not print anything at runtime.
 * F. If it prints anything, it will not include commas.  ***
 */
public class Test16 {
    public static void main(String[] arg) throws IOException {
        Path path = Paths.get("./temp/data/data.txt");
        Files.lines(path) // r1
                .flatMap(p -> Stream.of(p.split(","))) // r2
                .map(s -> s.toUpperCase()) // r3
                .forEach(System.out::println);
    }
}
