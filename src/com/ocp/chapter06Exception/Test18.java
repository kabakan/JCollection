package com.ocp.chapter06Exception;

/**
 * Created by Kanat KB on 07.10.2017.
 * <p>
 * 18. Which pairs fill in the blanks? The close() method is not allowed to throw
 * a(n) _________________ in a class that implements _________________. (Choose all that apply.)
 * <p>
 * 18. B. The main difference between AutoCloseable and Closeable is that AutoCloseable has
 * Exception in the signature and Closeable has only IOException in the signature. Since
 * IllegalStateException is a runtime exception, it can be thrown by any method.
 * <p>
 * A. Exception, AutoCloseable
 * B. Exception, Closeable   ***
 * C. IllegalStateException, AutoCloseable
 * D. IllegalStateException, Closeable
 * E. IOException, AutoCloseable
 * F. IOException, Closeable
 */
public class Test18 {
}
