package com.ocp.chapter05Localization;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Kanat KB on 03.10.2017.
 * <p>
 * 9. What is the output of the following code?
 * <p>
 * 9. B. The date starts out as April 30, 2018. Since dates are immutable and the plus methods
 * have their return values ignored, the result is unchanged. Therefore, Option B is correct.
 * <p>
 * A. 2018 APRIL 2
 * B. 2018 APRIL 30  ***
 * C. 2018 MAY 2
 * D. 2021 APRIL 2
 * E. 2021 APRIL 30
 * F. 2021 MAY 2
 * G. A runtime exception is thrown.
 */
public class Test09 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2);
        date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

    }
}
