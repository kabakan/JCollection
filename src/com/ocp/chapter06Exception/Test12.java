package com.ocp.chapter06Exception;

/**
 * Created by Kanat KB on 07.10.2017.
 * <p>
 * 12. Which of the following can legally fill in the blank? (Choose all that apply.)
 * <p>
 * 12. A, D, E. Since a single exception type is caught, only the same type of exception or a subclass
 * is allowed to be assigned to the variable in the catch block. Therefore D and E are
 * correct. Additionally A is correct because there are no changes to the variable.
 * <p>
 * A. // leave line blank  ***
 * B. e = new Exception();
 * C. e = new RuntimeException();
 * D. e = new SneezeException();  ***
 * E. e = new SniffleException();  ***
 * F. None of the above; the code does not compile.
 */
public class Test12 {
}

class AhChooDemo {
    static class SneezeException extends Exception {
    }

    static class SniffleException extends SneezeException {
    }

    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException e) {
            e = new SneezeException();
            e = new SniffleException();
            throw e;
        }
    }
}