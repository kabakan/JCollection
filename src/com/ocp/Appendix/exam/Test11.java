package com.ocp.Appendix.exam;
import java.util.Locale;
import java.text.NumberFormat;
/**
 * Created by Kanat KB on 04.11.2017.
 *
 * 11. C. The parse methods throw a checked ParseException. Checked exceptions must be
 caught.
 *
 * C. There is one compiler error.
 */
public class Test11 {
}
class MyParser {
    public static void main(String [] args) {
        NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        String value = "444,33";
        //System.out.println(nf.parse(value));
    }
}