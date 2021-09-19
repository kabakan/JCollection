package com.ocp_8.Appendix.exam;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 * Created by Kanat KB on 04.11.2017.
 *
 * 12. D. The 0 means a mandatory position and the # means an optional position. The format
 says that there must be either two or three digits before the decimal. Since we only have
 one, Java uses the smaller number. The format also says that there must be two, three, or
 four digits after the decimal. Since we have many digits, Java uses the larger number and
 rounds.
 *
 * D. 03,1416
 */
public class Test12 {
    public static void main(String [] args) {
        Locale.setDefault(Locale.GERMANY);
        DecimalFormat df = new DecimalFormat("#00.00##");
        double pi = 3.141592653;
        System.out.println(df.format(pi));
    }
}
