package com.example.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by Kanat KB on 02.10.2017.
 */
public class DateTime {
    public static void main(String[] args) {
        try {
        StringDateTime();
        /*LocalDateTime time_old =  LocalDateTime.now().minusMinutes(2);
        LocalDateTime time_now =  LocalDateTime.now();
        Integer interval = time_now.getMinute() - time_old.getMinute();
        System.out.println("time_old = "+time_old+" timw_now = "+time_now+" interval = "+interval);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        String time_session =  "BS"+LocalDateTime.now().minusMinutes(2).format(formatter);
        System.out.println("time_session = "+time_session);


        /*System.out.println("#1 SendChatAction begin :"+ LocalDateTime.now());
        System.out.println("#2 DateTime= "+Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));
        StringDateTime();
        getFormatDateString();
        getLocalDateStart();
        getPeriodMonth();
        getPeriod();
        getDateTimeNow();
        getDuration();
        getDayLight();
        getLocalTime();
        getLocalDate();
        */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  public static void StringDateTime() {
    try {
      System.out.println("----------StringDateTime() !-----------");
      String text = "2018-05-23 16:10:01.001";
      SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
      Date date = sdf.parse(text);
      System.out.println("FormatDate: "+sdf.format(date));

      java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
      System.out.println("Timestamp: "+timestamp.toString());
     // System.out.println("FormatString: "+String.format("%tY-%tm-%td %tH:%tM:%tS",timestamp));

      Instant instant = timestamp.toInstant();
      System.out.println("Format T: "+instant.toString());

      //return number of milliseconds since the epoch of 1970-01-01T00:00:00Z
      System.out.println(instant.toEpochMilli());

      //System.out.println("Formatter: "+String.format("yyyy-MM-dd'T'HH:mm:ss.SSSZ", timestamp));


    } catch (Exception e) {
      e.printStackTrace();
    }

  }



  public static void getFormatDateString(){
    System.out.println("----------getFormatDateString()-----------");

    String strDate = "2012-05-20T09:00:00.000Z";
    try {
      // create SimpleDateFormat object with source string date format
      SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'.000Z'");

      // parse the string into Date object
      Date date = sdfSource.parse(strDate);

      // create SimpleDateFormat object with desired date format
      SimpleDateFormat sdfDestination = new SimpleDateFormat(          "dd/MM/yyyy, ha");

      // parse the date into another format
      strDate = sdfDestination.format(date);

      System.out.println("Date is converted from yyyy-MM-dd'T'hh:mm:ss'.000Z' format to dd/MM/yyyy, ha");
      System.out.println("Converted date is : " + strDate.toLowerCase());




    } catch (ParseException pe) {
      System.out.println("Parse Exception : " + pe);
    }
  }

  public static void getLocalDateStart() {
    System.out.println("----------getLocalDateStart-----------");
    LocalDate a = LocalDate.now();
    System.out.println(a);

    LocalDate localDate = LocalDate.now();
    java.sql.Date dt = java.sql.Date.valueOf(LocalDate.now());

    System.out.println(dt.toString());
  }



    public static void StringDateTimeGMT() {
      System.out.println("----------StringDateTimeGMT()-----------");
      String text = "2013-07-29 06:35:40:622 GMT";
      SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
      TimeZone gmt = TimeZone.getTimeZone("GMT");
      sdf.setTimeZone(gmt);
      sdf.setLenient(false);

      try {
        Date date = sdf.parse(text);
        System.out.println(date);

        System.out.println(sdf.format(date));
      } catch (Exception e) {
        e.printStackTrace();
      }

    }

    public static void LocalDateTime() {
      System.out.println("----------LocalDateTime()-----------");
      /*DateFormat dateFormatStr = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
      Date dStr=new Date();
      System.out.println("STR DATE "+dateFormatStr.format(new Date("2013-07-29 06:35:40:622")));
      */

      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
      Date date = new Date();
      System.out.println(dateFormat.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
      System.out.println("SYSDATE "+dateFormat.format(date));
    }

    public static void getDateTimeNow() {
        System.out.println("----------getTest1-----------");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
    }

    public static void getPeriodMonth() {
        System.out.println("---------getPeriodMonth()-----------");
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalMonth(start, end);
    }

    private static void performAnimalMonth(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }

    public static void getPeriod() {
        System.out.println("----------getPeriod()-----------");
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // create a period
        performAnimalPeriod(start, end, period);
    }

    private static void performAnimalPeriod(LocalDate start, LocalDate end, Period period) { // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }

    public static void getDuration() {
        System.out.println("-----getDuration()-----");
        Duration daily = Duration.ofDays(1); // PT24H
        Duration hourly = Duration.ofHours(1); // PT1H
        Duration everyMinute = Duration.ofMinutes(1); // PT1M
        Duration everyTenSeconds = Duration.ofSeconds(10); // PT10S
        Duration everyMilli = Duration.ofMillis(1); // PT0.001S
        Duration everyNano = Duration.ofNanos(1); // PT0.000000001S

        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everyTenSeconds);
        System.out.println(everyMilli);
        System.out.println(everyNano);
    }

    public static void getDayLight() {
        System.out.println("------getDayLight()-------");
        LocalDate date = LocalDate.of(2017, Month.OCTOBER, 3);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime); // 2016–03–13T01:30–05:00[US/Eastern]
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2016–03–13T03:30–04:00[US/Eastern]
    }

    public static void getLocalDate() {
        System.out.println("------getDateTime()-------");
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20
    }

    public static void getLocalTime() {
        System.out.println("-----getLocalDate()------");
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

    public static  void dateFormat(){
        System.out.println("--------dateFormat()----------");
        DateFormat s = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat m = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat l = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        Date d = new GregorianCalendar(2015, Calendar.JULY, 4).getTime();

        System.out.println(s.format(d)); // 7/4/15
        System.out.println(m.format(d)); // Jul 4, 2015
        System.out.println(l.format(d)); // July 4, 2015
        System.out.println(f.format(d)); // Saturday, July 4, 2015
    }

}
