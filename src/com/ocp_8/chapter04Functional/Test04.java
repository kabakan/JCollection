package com.ocp_8.chapter04Functional;

/**
 * Created by Kanat KB on 02.10.2017.
 * 4. Which are true statements about terminal operations in a stream? (Choose all that apply.)
 * <p>
 * 4. A, B. Terminal operations are the final step in a stream pipeline. Exactly one is required,
 * because it triggers the execution of the entire stream pipeline. Therefore, options A and B
 * are correct. Options C and F are true of intermediate operations rather than terminal operations.
 * Option E is never true. Once a stream pipeline is run, the Stream is marked invalid.
 * <p>
 * A. At most one terminal operation can exist in a stream pipeline.  ***
 * B. Terminal operations are a required part of the stream pipeline in order to get a result. ***
 * C. Terminal operations have Stream as the return type.
 * D. The referenced Stream may be used after the calling a terminal operation.
 * E. The peek() method is an example of a terminal operation.
 */
public class Test04 {
}
