package com.ocp.Assesment.test16;

import java.time.Duration;
import java.time.Period;

/**
 * Created by Kanat KB on 22.07.2017.
 * A. false false
 */
public class Test16 {
    public static void main(String[] args) {
        String d = Duration.ofDays(1).toString();
        String p = Period.ofDays(1).toString();
        System.out.println(d + " " + p);
        boolean b1 = d == p;
        boolean b2 = d.equals(p);
        System.out.println(b1 + " " + b2);
    }
}
