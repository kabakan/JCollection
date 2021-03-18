package com.ocp.Appendix.exam;

import java.text.DecimalFormat;

/**
 * Created by Kanat KB on 04.11.2017.
 * 2. D. DecimalFormat uses a constructor rather than a factory. The 0 means a mandatory
 position and the # means an optional position. The format says that there must be either
 three or four digits before the decimal. Since we only have one, Java uses the smaller number.
 The format also says that there must be either one or two digits after the decimal. Since
 we have many digits, Java uses the larger number.
 *
 * D. 003.14
 */
public class Test02 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,000.0#");
        double pi = 3.141592653;
        System.out.println(df.format(pi));
    }
}
