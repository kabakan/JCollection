package com.ocp.chapter05Localization;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by Kanat KB on 03.10.2017.
 * <p>
 * 14. Note that March 13, 2016, is the weekend that we spring forward, and November 6, 2016,
 * is when we fall back for daylight savings time. Which of the following can fill in the blank
 * without the code throwing an exception?
 * <p>
 * 14. A, C, D. Option B is incorrect because there is no March 40th. Option E is incorrect
 * because 2017 isn’t a leap year and therefore has no February 29th. Option D is correct
 * because it is just a regular date and has nothing to do with daylight savings time. Options A
 * and C are correct because Java is smart enough to adjust for daylight savings time.
 * <p>
 * A. LocalDate.of(2016, 3, 13)
 * B. LocalDate.of(2016, 3, 40)
 * C. LocalDate.of(2016, 11, 6)
 * D. LocalDate.of(2016, 11, 7)
 * E. LocalDate.of(2017, 2, 29)
 */
public class Test14 {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("US/Eastern");
        LocalDate date = LocalDate.of(2016, 3, 13);
        LocalTime time1 = LocalTime.of(2, 15);
        ZonedDateTime a = ZonedDateTime.of(date, time1, zone);
    }
}
