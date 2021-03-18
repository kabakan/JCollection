package com.ocp.Appendix;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Kanat KB on 04.11.2017.
 */
public class Appendix {
    public static void main(String[] args){
        int x = 0;
         while(++x < 5) { x+=1; }
        System.out.println(x);
         String message = x > 5 ? "Greater than": "Less Than";
         System.out.println(message+","+x);

        double annoyingButLegal = 1_00_0.0_0;
        System.out.println("annoyingButLegal= "+annoyingButLegal);

        int dayOfWeek = 5;
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0_0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        //decmialFormat();
        //dateFormat();
        //getLock();
        LockReq();
    }

    private int getSortOrder(String firstName, final String lastName) {
        int id = 0;
     /*   String middleName = "Patricia";
        final String suffix = "JR";

        switch(firstName) {
            case "Test":
                return 52;
            case middleName: // DOES NOT COMPILE
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
            case lastName: // DOES NOT COMPILE
                id = 8;
                break;
            case 5: // DOES NOT COMPILE
                id = 7;
                break;
            case 'J': // DOES NOT COMPILE
                id = 10;
                break;
            case Month.JANUARY: // DOES NOT COMPILE
                id=15;
                break;
        } */
        return id;
    }

    public static void decmialFormat(){
        System.out.println("----decmialFormat()---");
         double d = 1234567.437;
         DecimalFormat one = new DecimalFormat("###,###,###.###");
         System.out.println(one.format(d)); // 1,234,567.437

         DecimalFormat two = new DecimalFormat("000,000,000.00000");
         System.out.println(two.format(d)); // 001,234,567.43700

         DecimalFormat three = new DecimalFormat("$#,###,###.##");
         System.out.println(three.format(d)); // $1,234,567.44
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

    public static void getLock(){
        System.out.println("-----getLock()--------");
        int birdCount =0;
        Object object = new Object();
        synchronized(object) {
            System.out.print(" "+(++birdCount));
        }
// Implementation #2 with a Lock
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            System.out.print(" "+(++birdCount));
        } finally {
            lock.unlock();
        }
     }

    public static void LockReq(){
        int birdCount = 0;
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            lock.lock();
            ++birdCount;
        } finally {
            lock.unlock();
        }
        new Thread(() -> {
            if(lock.tryLock()) {
                try {
                    System.out.println("Acquired");
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Unavailable");
            }
        }).start();
    }

}
