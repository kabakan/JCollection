package com.ocp.Assesment.test10;

/**
 * Created by Kanat KB on 12.07.2017.
 * F. The output is 11.
 */
public class AssertDemo {
    public static void main(String[] args) {
        Integer x = 10;
        x++;
        assert x == null && x >= 0;
        System.out.println(x);
    }
}
