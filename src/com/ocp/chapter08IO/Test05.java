package com.ocp.chapter08IO;

import java.io.Console;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Kanat KB on 19.10.2017.
 * 5. What is the result of executing the following code? (Choose all that apply.)
 * <p>
 * 5. B, D, E. This is correct code for reading a line from the console and writing it back out
 * to the console, making option B correct. Options D and E are also correct. If no console
 * is available, a NullPointerException is thrown. The append() method throws an IOException.
 * <p>
 * A. The code runs without error but prints nothing.
 * B. The code prints what was entered by the user.   ***
 * C. An ArrayIndexOutOfBoundsException might be thrown.
 * D. A NullPointerException might be thrown.  ***
 * E. An IOException might be thrown.  ***
 * F. The code does not compile.
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        String line;
        Console c = System.console();
        Writer w = c.writer();
        if ((line = c.readLine()) != null)
            w.append(line);
        w.flush();
    }
}
