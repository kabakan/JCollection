package com.ocp.chapter09NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * Created by Kanat KB on 24.10.2017.
 * 17. Assuming the current directory is /animals/cute, which are possible results of executing
 * the following code? (Choose all that apply.)
 * <p>
 * 17. A, G. The code compiles without issue, so B, C, and D are incorrect. The first line
 * actually resolves to the root path since .. and getParent()are conceptually equivalent.
 * Therefore, G is correct and E and F are incorrect. A is also correct since it may encounter
 * a file that it does not have access to read, which is common when trying to read an entire
 * file system.
 * <p>
 * A. It compiles but may throw an exception at runtime.    ***
 * B. The code will not compile because of line u1.
 * C. The code will not compile because of line u2.
 * D. The code will not compile because of line u3.
 * E. It prints all .java files in the /animals directory tree.
 * F. It prints all .java files in the /animals/cute directory tree.
 * G. It prints all .java files in the root directory tree.   ***
 */
public class Test17 {
    public static void main(String[] arg) throws IOException {
        Files.walk(Paths.get("..").toRealPath().getParent()) // u1
                .map(p -> p.toAbsolutePath().toString()) // u2
                .filter(s -> s.endsWith(".txt")) // u3
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
