package com.ocp_8.chapter05Localization;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Kanat KB on 03.10.2017.
 * <p>
 * 7. What is the output of the following code?
 * <p>
 * 7. D. A LocalDate does not have a time element. Therefore, it has no method to add hours,
 * and the code does not compile.
 * <p>
 * A. 2018 APRIL 2
 * B. 2018 APRIL 30
 * C. 2018 MAY 2
 * D. The code does not compile.  ***
 * E. A runtime exception is thrown.
 */
public class Test07 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018–04–30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2);
        // date.plusHours(3);
        System.out.println(date.getYear() + " "
                + date.getMonth() + " " + date.getDayOfMonth());
    }
}
