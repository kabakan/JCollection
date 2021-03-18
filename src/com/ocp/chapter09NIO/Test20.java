package com.ocp.chapter09NIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Kanat KB on 24.10.2017.
 * 20. Assuming the current directory is /seals/harp/food, what is the result of executing the
 * following code?
 * <p>
 * 20. B. The normalize() method does not convert a relative path into an absolute path; therefore,
 * the path value after the first line is just the current directory symbol. The for() loop
 * iterates the name values, but since there is only one entry, the loop terminates after a single
 * iteration. Therefore, B is correct and the rest of the answers are incorrect.
 * <p>
 * A. 0
 * B. 1   ***
 * C. 2
 * D. 3
 * E. 4
 * F. The code throws a runtime exception because of line h1.
 */
public class Test20 {
    public static void main(String[] arg) throws IOException {
        final Path path = Paths.get(".").normalize(); // h1
        int count = 0;
        for (int i = 0; i < path.getNameCount(); ++i) {
            count++;
        }
        System.out.println(count);
    }
}
