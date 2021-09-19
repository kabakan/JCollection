package com.ocp_8.chapter08IO;

/**
 * Created by Kanat KB on 19.10.2017.
 * 19. Suppose that you need to write data that consists of int, double, boolean, and String values to
 * a file that maintains the format of the original data. For performance reasons, you also want to
 * buffer the data. Which three java.io classes can be chained together to best achieve this result?
 * <p>
 * 19. B, C, D. Since you need to write primitives and String values, the OutputStream classes
 * are appropriate. Therefore, you can eliminate A and F since they are not OutputStream
 * classes. Next, DirectoryStream is not a java.io class, so E is incorrect. As you shall see
 * in the next chapter, DirectoryStream is an NIO.2 class. The data should be written to the
 * file directly using the FileOutputStream class, buffered with the BufferedOutputStream
 * class and automatically serialized with the ObjectOutputStream class, so B, C, and D are
 * correct. G is incorrect because it is not related to this task. We include it as an option to
 * help you adapt to situations on the exam where you may come across a class with which
 * you are not familiar. Just answer as best you can, based on what you know.
 * <p>
 * A. FileWriter
 * B. FileOutputStream        ***
 * C. BufferedOutputStream    ***
 * D. ObjectOutputStream      ***
 * E. DirectoryStream
 * F. PrintWriter
 * G. PipedOutputStream
 */
public class Test19 {
}
