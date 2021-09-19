package com.ocp_8.chapter05Localization;

import java.time.LocalDate;

/**
 * Created by Kanat KB on 03.10.2017.
 * <p>
 * 6. Which of the following can be inserted into the blank to create a date of June 21, 2014?
 * (Choose all that apply.)
 * <p>
 * 6. D, F. Options A and B are incorrect because LocalDate does not have a public constructor.
 * Option C is incorrect because months start counting with 1 rather than 0. Option E
 * is incorrect because it uses the old Calendar constants for months, which begin with 0.
 * Options D and F are both correct ways of specifying the desired date.
 * <p>
 * A. new LocalDate(2014, 5, 21);
 * B. new LocalDate(2014, 6, 21);
 * C. LocalDate.of(2014, 5, 21);
 * D. LocalDate.of(2014, 6, 21);
 * E. LocalDate.of(2014, Calendar.JUNE, 21);
 * F. LocalDate.of(2014, Month.JUNE, 21);
 */
class StartOfSummer {
    public static void main(String[] args) {
        //LocalDate date = LocalDate.of(2014, Month.JUNE, 21);
        LocalDate date = LocalDate.of(2014, 6, 21);
        System.out.println(date);
    }
}
public class Test06 {
}
