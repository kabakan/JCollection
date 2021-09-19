package com.ocp_8.chapter05Localization;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by Kanat KB on 03.10.2017.
 * <p>
 * 10. What is the output of the following code?
 * <p>
 * 10. E. Even though d has both date and time, the formatter only outputs time.
 * <p>
 * A. 3/7/14 11:22 AM
 * B. 5/10/15 11:22 AM
 * C. 3/7/14
 * D. 5/10/15
 * E. 11:22 AM   ***
 * F. The code does not compile.
 * G. A runtime exception is thrown.
 */
public class Test10 {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.
                ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));
    }
}
