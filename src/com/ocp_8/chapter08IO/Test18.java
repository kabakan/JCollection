package com.ocp_8.chapter08IO;

import java.io.Console;
import java.io.IOException;

/**
 * Created by Kanat KB on 19.10.2017.
 * 18. Which values when inserted into the blank would allow the code to compile? (Choose all that apply.)
 * <p>
 * 18. B, D, E. Console defines two output methods, format() and printf(), that are identical
 * in function, so B and D are correct. A, C, and F are each incorrect, because there is no
 * such method with that name defined in the Console class. You can also use the writer()
 * method to gain access to the Console’s PrintWriter object, so E is correct.
 * <p>
 * A. print
 * B. printf              ***
 * C. println
 * D. format              ***
 * E. writer().println    ***
 * F. out
 */
public class Test18 {
    public static void main(String[] args) throws IOException {
        Console console = System.console();
        String color = console.readLine("What is your favorite color? ");
        console.printf("Your favorite color is " + color);
    }
}
