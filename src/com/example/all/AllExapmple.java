package com.example.all;

import java.util.Optional;
import java.util.StringTokenizer;

public class AllExapmple {

    public static void main(String[] args) {
        double d = 1e0;
        Integer i = 14%3; //(mod) 14/3=4 saldo 2
        Integer j = 14%-3; //(mod) 14/3=4 saldo -2
        System.out.println("Result: "+i);
        System.out.println("Result: "+j);
        j = 12/(-3);
        System.out.println("Result: "+j);
        //  double d =1.;
        //double d =1e;
        //   double d =.1;
        //double d =.1e-1;

        // getByte();
        //getToken();
        //getRandom();
        // getOptional();

     /*   System.out.println("//------------- Generic ------------//");
        Generic<Double, String> pair = new Generic<Double, String>(8.5, " Dodze");
        System.out.println(pair.getFirst() + pair.getSecond());

        LamdaList();
        LamdaList2(); */

    }

    public static void getByte() {
        System.out.println("//------------- Byte ------------//");
        System.out.println("int 1 = " + (byte) 400);
        System.out.println("int 2 = " + (byte) 500);
        System.out.println("int 3 = " + (byte) 600);
    }

    public static void getRandom() {
        System.out.println("//------------- Random ------------//");
        int i = (int) (Math.random() * 20) * 5;
        System.out.println("random = " + i);
    }

    public static void getToken() {
        try {
            String dict = "";
            String word = "";
            String weight = "";
            System.out.println("//------------- Token ------------//");
            StringTokenizer st = new StringTokenizer("дорогой:101;дешовый:102;удобный:103;", ";",
                false);
            while (st.hasMoreTokens()) {
                dict = st.nextToken();
                System.out.println("dictionary: "+ dict);

                StringTokenizer d = new StringTokenizer(dict, ":", false);
                while (d.hasMoreTokens()) {
                    word = d.nextToken();
                    weight = d.nextToken();
                    System.out.println("word: "+word);
                    System.out.println("weight: "+weight);
                }
            }
        }catch (Exception ex) {
            System.out.println("getToken(): "+ex.getMessage());
        }
    }

    public static void getOptional() {
        System.out.println("//------------- Optional ------------//");
        Optional<String> optional;
        optional = Optional.empty();

        if (optional.isPresent()) {
            System.out.println("Yes");
        } else {
            optional.of("Java");
        }
        System.out.println(optional.orElse("Unknown"));
    }

}
