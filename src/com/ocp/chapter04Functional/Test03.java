package com.ocp.chapter04Functional;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 02.10.2017.
 * <p>
 * 3. What is the output of the following?
 * Predicate<? super String> predicate
 * <p>
 * 3. E. An infinite stream is generated where each element is twice as long as the previous
 * one. b1 is set to false because Java finds an element that doesn’t match when it gets to
 * the element of length 4. However, the next line tries to operate on the same stream. Since
 * streams can be used only once, this throws an exception that the “stream has already been
 * operated upon or closed.” If two different streams were used, the result would be option A.
 * <p>
 * A. false true
 * B. false false
 * C. java.util.stream.ReferencePipeline$3@4517d9a3
 * D. The code does not compile.
 * E. An exception is thrown.  ***
 * F. The code hangs.
 */
public class Test03 {
    public static void main(String[] args) {
        try {
            Predicate<? super String> predicate = s -> s.length() > 3;
            Stream<String> stream = Stream.iterate("-", (s) -> s + s);
            boolean b1 = stream.noneMatch(predicate);
            boolean b2 = stream.anyMatch(predicate);
            System.out.println(b1 + " " + b2);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
