package com.ocp.chapter08IO;

/**
 * Created by Kanat KB on 19.10.2017.
 * 17. Which of the following stream classes are high-level? (Choose all that apply.)
 * <p>
 * 17. A, B, D, G. ObjectOutputStream and ObjectInputStream perform serialization and
 * deserialization on a low-level stream, respectively, so A and G are correct. PrintStream
 * and PrintWriter format text for a low-level OutputStream and Writer, respectively, so
 * B and D are also correct. FileWriter and FileInputStream operate on a file directly and
 * are low-level streams, so C and F are incorrect. Finally, OutputStream is an abstract parent
 * class and is neither high-level nor low-level, so E is incorrect.
 * <p>
 * A. ObjectInputStream    ***
 * B. PrintStream          ***
 * C. FileWriter
 * D. PrintWriter          ***
 * E. OutputStream
 * F. FileInputStream
 * G. ObjectOutputStream   ***
 */
public class Test17 {
}
