package com.ocp_8.chapter05Localization;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Kanat KB on 03.10.2017.
 * <p>
 * 8. What is the output of the following code?
 * <p>
 * 8. F. Java throws an exception if invalid date values are passed. There is no 40th day in
 * April—or any other month for that matter.
 * <p>
 * A. 2018 APRIL 4
 * B. 2018 APRIL 30
 * C. 2018 MAY 10
 * D. Another date
 * E. The code does not compile.
 * F. A runtime exception is thrown.  ***
 */
public class Test08 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
