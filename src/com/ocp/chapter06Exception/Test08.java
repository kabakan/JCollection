package com.ocp.chapter06Exception;

/**
 * Created by Kanat KB on 07.10.2017.
 * 8. Which of the following command lines cause this program to fail on the assertion? (Choose all that apply.)
 * <p>
 * 8. B, C. Java uses the flags –ea or –enableassertions to turn on assertions. –da or
 * –disableassertions turns off assertions. The colon indicates for a specific class. Choice B
 * is correct because it turns on assertions for all code. Choice C is correct because it disables
 * assertions but then turns them back on for this class.
 * <p>
 * <p>
 * A. java –da On
 * B. java –ea On  ***
 * C. java -da -ea:On On  ***
 * D. java -ea -da:On On
 * E. The code does not compile.
 */
public class Test08 {
}

class On {
    public static void main(String[] args) {
        String s = null;
        assert s != null;
    }
}