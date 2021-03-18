package com.ocp.chapter05Localization;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by Kanat KB on 03.10.2017.
 * <p>
 * 11. What is the output of the following code?
 * <p>
 * 11. B. Period does not allow chaining. Only the last Period method called counts, so only the
 * two years are subtracted.
 * <p>
 * A. 5/9/13 11:22 AM
 * B. 5/10/13 11:22 AM   ***
 * C. 5/9/14
 * D. 5/10/14
 * E. The code does not compile.
 * G. A runtime exception is thrown.
 */
public class Test11 {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));
    }
}
