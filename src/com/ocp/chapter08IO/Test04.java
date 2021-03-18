package com.ocp.chapter08IO;

import java.io.Console;

/**
 * Created by Kanat KB on 19.10.2017.
 * 4. Which of the following can fill in the blank to make the code compile? (Choose all that apply.)
 * <p>
 * 4. C. The readLine() method returns a String and reads a line of input from the console.
 * readPassword() returns a char[]. The others do not exist.
 * <p>
 * A. c.input()
 * B. c.read()
 * C. c.readLine() ***
 * D. c.readPassword()
 * E. c.readString()
 * F. None of the above
 */
public class Test04 {
    public static void main(String[] args) {
        Console c = System.console();
        String s = c.readLine();
    }
}
