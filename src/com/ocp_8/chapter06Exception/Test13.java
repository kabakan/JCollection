package com.ocp_8.chapter06Exception;

/**
 * Created by Kanat KB on 07.10.2017.
 * 13. Which of the following can legally fill in the blank? (Choose all that apply.)
 * <p>
 * 13. A. Since a multi-catch is used, the variable in the catch block is effectively final and cannot
 * be reassigned.
 * <p>
 * A. // leave line blank  ***
 * B. e = new Exception();
 * C. e = new RuntimeException();
 * D. e = new SneezeException();
 * E. e = new SniffleException();
 * F. None of the above; the code does not compile.
 */
public class Test13 {
}

class AhChoo {
    static class SneezeException extends Exception {
    }

    static class SniffleException extends SneezeException {
    }

    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException | RuntimeException e) {
            //
            throw e;
        }
    }
}