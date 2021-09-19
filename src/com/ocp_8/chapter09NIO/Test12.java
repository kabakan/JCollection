package com.ocp_8.chapter09NIO;

/**
 * Created by Kanat KB on 24.10.2017.
 * 12. Which of the following methods cannot be used to obtain a Path instance? (Choose all that apply.)
 * <p>
 * 12. A, F. For this question, you need to rule out the answers that can be used to obtain a Path
 * instance. D and G both use the Paths.get() method, one with optional vararg values.
 * C uses an overloaded version of Paths.get() that takes a URI. B is a longer form for getting
 * a Path using a specific file system, in this case the default file system. Finally, E uses
 * a method added to java.io.File to make it easily compatible with Path. The remaining
 * choices A and F are the correct ones, because they call constructors on Path and FileSystem,
 * respectively, instead of using the underlying factory methods. The rest are invalid since
 * they do not use the factory methods to gain access to instances.
 * <p>
 * A. new Path("jaguar.txt")    ***
 * B. FileSystems.getDefault().getPath("puma.txt")
 * C. Paths.get(new URI("cheetah.txt"))
 * D. Paths.get("cats","lynx.txt")
 * E. new java.io.File("tiger.txt").toPath()
 * F. new FileSystem().getPath("leopard")  ***
 * G. Paths.getPath("ocelot.txt")
 */
public class Test12 {

}
