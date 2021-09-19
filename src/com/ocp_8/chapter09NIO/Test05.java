package com.ocp_8.chapter09NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Kanat KB on 24.10.2017.
 * <p>
 * 5. B, C, D. The first clause of the if/then statement will be true only if the target of the
 * symbolic link, /mammal/kangaroo, exists, since by default isDirectory() follows symbolic
 * links, so B is correct. Option A is incorrect because /mammal/kangaroo may not exist
 * or /mammal/kangaroo/joey may already exist. If /mammal/kangaroo does exist, then the
 * directory will be created at /mammal/kangaroo/joey, and because the symbolic link would
 * be accessible as /kang/joey, C and D are both correct. E is incorrect, because the code
 * compiles without issue. F is incorrect because the code may throw an exception at runtime,
 * such as when the file system is unavailable or locked for usage; thus it is not guaranteed to
 * throw an exception at runtime.
 * <p>
 * A. A new directory will always be created.
 * B. A new directory will be created only if /mammal/kangaroo exists.    ***
 * C. If the code creates a directory, it will be reachable at /kang/joey.    ***
 * D. If the code creates a directory, it will be reachable at /mammal/kangaroo/joey.  ***
 * E. The code does not compile.
 * F. The code will compile but always throws an exception at runtime.
 */
public class Test05 {
    public static void main(String[] arg) throws IOException {
        Path path = Paths.get("./temp");
        if (Files.isDirectory(path) && Files.isSymbolicLink(path)) {
            Files.createDirectory(path.resolve("data77"));
            System.out.println("true");
        }
    }
}
