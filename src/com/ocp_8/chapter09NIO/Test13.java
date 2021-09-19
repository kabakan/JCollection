package com.ocp_8.chapter09NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * Created by Kanat KB on 24.10.2017.
 * 13. Assume /monkeys exists as a regular directory containing multiple files, symbolic links,
 * and subdirectories. What is true about the following code? (Choose all that apply.)
 * <p>
 * 13. B. The code compiles and runs without issue, so C, D, E, F, and G are incorrect. Note that
 * the sample code creates a stream, collects it as a list, and then converts it back to a stream
 * before outputting the filenames. The key here is that the depth parameter specified as the
 * second argument to find() is 0, meaning the only record that will be searched is the toplevel
 * directory. Since we know that the top directory is regular and not a symbolic link, no
 * other paths will be visited and nothing will be printed. For these reasons, B is the correct
 * answer and A is incorrect.
 * <p>
 * A. It will print all symbolic links in the directory tree ending in .txt.
 * B. It will print nothing.           ***
 * C. It does not compile because of line y1.
 * D. It does not compile because of line y2.
 * E. It does not compile because of line y3.
 * F. It does not compile because of line y4.
 * G. It compiles but throws an exception at runtime.
 */
public class Test13 {
    public static void main(String[] arg) throws IOException {
        Path path = Paths.get("./temp/data/");
        Files.find(path, 0, (p, a) -> a.isSymbolicLink()).map(p -> p.toString()) // y1
                .collect(Collectors.toList()) // y2
                .stream() // y3
                .filter(x -> x.toString().endsWith(".txt")) // y4
                .forEach(System.out::println);
    }
}
