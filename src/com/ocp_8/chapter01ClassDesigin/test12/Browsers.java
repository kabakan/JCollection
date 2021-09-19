package com.ocp_8.chapter01ClassDesigin.test12;

/**
 * Created by Kanat KB on 22.07.2017.
 * E. A runtime exception is thrown.
 */
public class Browsers {
    static class Browser {
        public void go() {
            System.out.println("Inside Browser");
        }
    }
    static class Firefox extends Browser {
        public void go() {
            System.out.println("Inside Firefox");
        }
    }
    static class IE extends Browser {
        @Override public void go() {
            System.out.println("Inside IE");
        }
    }
    public static void main(String[] args) {
        try {
            Browser b = new Firefox();
            IE e = (IE) b;
            e.go();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
