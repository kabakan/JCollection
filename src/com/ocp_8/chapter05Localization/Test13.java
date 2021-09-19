package com.ocp_8.chapter05Localization;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Created by Kanat KB on 03.10.2017.
 * <p>
 * 13. Note that March 13, 2016, is the weekend that clocks spring ahead for daylight savings
 * time. What is the output of the following?
 * <p>
 * 13. B. dateTime1 is 2016–03–13T01:30–05:00[US/Eastern] and dateTime2 is
 * 2016–03–13T03:30–04:00[US/Eastern]. While the values are two hours apart, the time
 * zone offset changes as well, making it only change from 6:30 GMT to 7:30 GMT.
 * <p>
 * A. 1,1,2
 * B. 1,1,3    ***
 * C. 2,1,2
 * D. 2,1,3
 * E. The code does not compile.
 * F. A runtime exception is thrown.
 */
public class Test13 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
        ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
        long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        int clock1 = dateTime1.getHour();
        int clock2 = dateTime2.getHour();
        System.out.println(hours + "," + clock1 + "," + clock2);
    }
}
