package com.ocp.chapter08IO;

/**
 * Created by Kanat KB on 19.10.2017.
 * 11. Which of the following are methods available to instances of the java.io.File class? (Choose all that apply.)
 * <p>
 * 11. C, E, G. To move a file using java.io.File, you should use the renameTo() method, since
 * there are no move() or mv() methods. Therefore, E is correct, and A and D are incorrect.
 * To create a directory or chain of directories using java.io.File, you should use mkdir()
 * or mkdirs(), respectively, because there is no createDirectory() method. Therefore,
 * C and G are correct, and B is incorrect. Finally, there is no copy() method in the java.
 * io.File class, so F is incorrect. Copying a file with java.io would require reading the
 * contents using a stream.
 * <p>
 * A. mv()
 * B. createDirectory()
 * C. mkdirs()   ***
 * D. move()
 * E. renameTo()  ***
 * F. copy()
 * G. mkdir()  ***
 */
public class Test11 {
}
