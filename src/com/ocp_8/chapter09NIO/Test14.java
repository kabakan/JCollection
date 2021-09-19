package com.ocp_8.chapter09NIO;

/**
 * Created by Kanat KB on 24.10.2017.
 * 14. Which NIO.2 method is most similar to the legacy java.io.File.listFiles() method?
 * <p>
 * 14. E. First off, recall that the java.io.File.listFiles() method retrieves the members
 * of the current directory without traversing any subdirectories. The methods Path.list-
 * Files() and Files.files() do not exist, so A and D are incorrect. Files.walk() and
 * Files.find() recursively traverse a directory tree rather than list the contents of the
 * current directory; therefore, they are not a close match, and B and C are incorrect. Note
 * that you could use these methods to perform the same operation if you set the depth limit
 * to 1 and used a lambda with Files.find() that always returns true, but the question
 * was about which method is most similar to java.io.File.listFiles(). In that regard,
 * Files.list() is the closest match since it always reads only a single directory, and E is
 * correct. Note that instead of an array, a stream of Path values is returned. Finally, F is
 * incorrect because it reads the contents of a file, not a directory.
 * <p>
 * A. Path.listFiles()
 * B. Files.walk()
 * C. Files.find()
 * D. Files.files()
 * E. Files.list()    ***
 * F. Files.lines()
 */
public class Test14 {
}
