package com.ocp.Assesment.test13;

import java.io.Console;

/**
 * Created by Kanat KB on 13.07.2017.
 * D. A NullPointerException might be thrown.
 */
public class Test13 {
    public static void main(String[] args) {
        String line;
        Console c = System.console();
        if ((line = c.readLine()) != null)
            System.out.println(line);
    }
}
