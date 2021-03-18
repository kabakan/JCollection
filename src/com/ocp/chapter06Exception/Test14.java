package com.ocp.chapter06Exception;

/**
 * Created by Kanat KB on 07.10.2017.
 * <p>
 * 14. Which of the following can legally fill in the blank? (Choose all that apply.)
 * <p>
 * 14. F. A multi-catch cannot catch both a superclass and subclass. Notice how similar questions
 * can be while testing something that is entirely different.
 * <p>
 * A. // leave line blank
 * B. e = new Exception();
 * C. e = new RuntimeException();
 * D. e = new SneezeException();
 * E. e = new SniffleException();
 * F. None of the above; the code does not compile.  ***
 */
public class Test14 {
}

class AhChooDemo1 {
    static class SneezeException extends Exception {
    }

    static class SniffleException extends SneezeException {
    }
  /*  public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException | SniffleException e) {
            //
            throw e;
        }
    } */
}