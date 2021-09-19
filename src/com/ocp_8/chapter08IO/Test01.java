package com.ocp_8.chapter08IO;

import java.io.*;

/**
 * Created by Kanat KB on 19.10.2017.
 * 1. Which classes will allow the following to compile? (Choose all that apply.)
 * <p>
 * 1. A, D. The reference is for an InputStream object, so only a high-level input Stream class
 * is permitted. B is incorrect because FileInputStream is a low-level stream that interacts
 * directly with a file resource, not a stream resource. C and F are incorrect because you cannot
 * use BufferedReader/BufferedWriter directly on a stream. E is incorrect because
 * the reference is to an InputStream, not an OutputStream. A and D are the only correct
 * options. Note that a BufferedInputStream can be wrapped twice, since high-level streams
 * can take other high-level streams.
 * <p>
 * A. BufferedInputStream ***
 * B. FileInputStream
 * C. BufferedWriter
 * D. ObjectInputStream  ***
 * E. ObjectOutputStream
 * F. BufferedReader
 */
public class Test01 {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = new BufferedInputStream(new FileInputStream("zoo.txt"));
        InputStream wrapper = new BufferedInputStream(is);
    }
}
