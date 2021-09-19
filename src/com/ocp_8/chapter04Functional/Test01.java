package com.ocp_8.chapter04Functional;

import java.util.stream.Stream;

/**
 * Created by Kanat KB on 02.10.2017.
 * <p>
 * 1. What is the output of the following?
 * <p>
 * 1. D. No terminal operation is called, so the stream never executes. The methods chain to
 * create a stream that would contain “2” and “12.” The first line creates an infinite stream.
 * The second line would get the first two elements from that infinite stream and map each
 * element to add an extra character.
 * <p>
 * A. 12112
 * B. 212
 * C. 212112
 * D. java.util.stream.ReferencePipeline$3@4517d9a3  ***
 * E. The code does not compile.
 * F. An exception is thrown.
 * G. The code hangs.
 */
public class Test01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));
    }
}
