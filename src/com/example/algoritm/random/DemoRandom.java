package com.example.algoritm.random;

import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n1 = 100000 + rnd.nextInt(900000);
        int n2 = 100000 + rnd.nextInt(900000);
        String acc1 = "ACC5577"+n1;
        String acc2 = "ACC5577"+n2;
        System.out.println("account: "+acc1);
        System.out.println("account: "+acc2);
    }
}
