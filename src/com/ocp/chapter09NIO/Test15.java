package com.ocp.chapter09NIO;

/**
 * Created by Kanat KB on 24.10.2017.
 * 15. What are some advantages of using NIO.2 views to read metadata rather than individually
 * from java.nio.Files methods? (Choose all that apply.)
 * <p>
 * 15. D, E, F. Whether a path is a symbolic link, file, or directory is not relevant, so A and C are
 * incorrect. Using a view to read multiple attributes leads to fewer round-trips between the
 * process and the file system and better performance, so D and F are correct. For reading single
 * attributes, there is little or no expected gain, so B is incorrect. Finally, views can be used
 * to access file system–specific attributes that are not available in java.nio.Files methods;
 * therefore E is correct.
 * <p>
 * A. It can be used on both files and directories.
 * B. For reading a single attribute, it is often more performant.
 * C. It allows you to read symbolic links.
 * D. It makes fewer round-trips to the file system.  ***
 * E. It can be used to access file system–dependent attributes.  ***
 * F. For reading multiple attributes, it is often more performant.  ***
 */
public class Test15 {
}
