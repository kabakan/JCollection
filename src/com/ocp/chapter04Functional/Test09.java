package com.ocp.chapter04Functional;

import java.util.OptionalLong;
import java.util.stream.LongStream;

/**
 * Created by Kanat KB on 02.10.2017.
 * 9. Which of the following can we add after line 5 for the code to run without error and not
 * produce any output? (Choose all that apply.)
 * <p>
 * 9. B, D. Option A would work for a regular Stream. However, we have a LongStream and
 * therefore need to call getAsLong(). Option C is missing the :: that would make it a
 * method reference. Therefore, options B and D are correct.
 * <p>
 * A. if (opt.isPresent()) System.out.println(opt.get());
 * B. if (opt.isPresent()) System.out.println(opt.getAsLong());   ***
 * C. opt.ifPresent(System.out.println)
 * D. opt.ifPresent(System.out::println)  ***
 * E. None of these; the code does not compile.
 * F. None of these; line 5 throws an exception at runtime.
 */
public class Test09 {
    public static void main(String[] args) {
        LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
        if (opt.isPresent()) System.out.println(opt.getAsLong());
        opt.ifPresent(System.out::println);
    }
}

