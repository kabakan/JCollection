package com.ocp.chapter09NIO;

/**
 * Created by Kanat KB on 24.10.2017.
 * 9. What are some advantages of using Files.lines() over Files.readAllLines()? (Choose
 * all that apply.)
 * <p>
 * 9. B, C. The methods are not the same, because Files.lines() returns a Stream<Path> and
 * Files.readAllLines() returns a List<String>, so F is incorrect. A is incorrect, because
 * performance is not often the reason to prefer one to the other. Files.lines() reads the
 * file in a lazy manner, while Files.readAllLines() reads the entire file into memory all at
 * once; therefore Files.lines() works better on large files with limited memory available,
 * and B is correct. Although a List can be converted to a stream with the stream() method,
 * this requires an extra step; therefore C is correct since the resulting object can be chained
 * directly to a stream. Finally, D and E are incorrect because they are not relevant to these
 * methods.
 * <p>
 * A. It is often faster.
 * B. It can be run on large files with very little memory available.  ***
 * C. It can be chained with stream methods directly.  ***
 * D. It does not modify the contents of the file.
 * E. It ensures the file is not read-locked by the file system.
 * F. There are no differences, because one method is a pointer to the other.
 */
public class Test09 {
}
