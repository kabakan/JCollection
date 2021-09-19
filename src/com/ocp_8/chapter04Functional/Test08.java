package com.ocp_8.chapter04Functional;

/**
 * Created by Kanat KB on 02.10.2017.
 * 8. Which of the following are true given the declaration IntStream is = IntStream.
 * empty()? (Choose all that apply.)
 * <p>
 * 8. D, E. The sum() method returns an int rather than an OptionalInt because the sum
 * of an empty list is zero. Therefore, option E is correct. The findAny() method returns
 * an OptionalInt because there might not be any elements to find. Therefore, option D is
 * correct. The average() method returns an OptionalDouble since averages of any type can
 * result in a fraction. Therefore, options A and B are both incorrect.
 * <p>
 * A. is.average() returns the type int.
 * B. is.average() returns the type OptionalInt.
 * C. is.findAny() returns the type int.
 * D. is.findAny() returns the type OptionalInt.   ***
 * E. is.sum() returns the type int.               ***
 * F. is.sum() returns the type OptionalInt.
 */
public class Test08 {
}
