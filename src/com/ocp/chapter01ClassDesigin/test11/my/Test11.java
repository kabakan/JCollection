package com.ocp.chapter01ClassDesigin.test11.my;

import com.ocp.chapter01ClassDesigin.test11.my.sports.Football;

/**
 * Created by Kanat KB on 22.07.2017.
 */
public class Test11 {
    public static void main(String[] args) {
        Football f = new Football();
        boolean b = f instanceof  Football;
        if (b) System.out.println("Success");
    }
}
