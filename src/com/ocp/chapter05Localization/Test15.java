package com.ocp.chapter05Localization;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by Kanat KB on 03.10.2017.
 * 15. Given the following code, which of the answer choices can fill in the blank to print true?
 * <p>
 * 15. B, C. Options A and D are incorrect because the String references do not point to the
 * same object. Option E is incorrect because a Period format begins with a P and a Duration
 * format begins with PT. They are different types and do not represent the same value
 * even though they are both a day. Remember that Duration uses hours/minutes/seconds and
 * Period uses years/months/days for measures. Options B and C are correct because m1, m2,
 * and s all represent a duration of the same length.
 * <p>
 * A. m1 == m2
 * B. m1.equals(m2)   ***
 * C. m1.equals(s)    ***
 * D. d == p
 * E. d.equals(p)
 */
public class Test15 {
    public static void main(String[] args) {
        String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
        String m2 = Duration.ofMinutes(1).toString();
        String s = Duration.of(60, ChronoUnit.SECONDS).toString();
        String d = Duration.ofDays(1).toString();
        String p = Period.ofDays(1).toString();
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(s));
    }
}
