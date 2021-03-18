package com.ocp.chapter05Localization;

import java.time.*;

/**
 * Created by Kanat KB on 03.10.2017.
 * <p>
 * 16. Given the following, which answers can correctly fill in the blank?
 * <p>
 * 16. A, B, F. Option A correctly creates the current instant. Option B correctly converts from
 * seconds to an Instant. Option F is also a proper conversion. Options C, D, and E are
 * incorrect because the source object does not represent a point in time. Without a time zone,
 * Java doesn’t know what moment in time to use for the Instant.
 * <p>
 * A. Instant.now()   ***
 * B. Instant.ofEpochSecond(epochSeconds) ***
 * C. date.toInstant()
 * D. dateTime.toInstant()
 * E. time.toInstant()
 * F. zonedDateTime.toInstant()  ***
 */
public class Test16 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        long epochSeconds = 0;
        Instant instant = Instant.now();
    }
}
