package com.example.lamda;

/**
 * Created by Kanat KB on 12.09.2017.
 */
public class GorillaFamily {
    String walk = "walk";

    public void everyonePlay(boolean baby) {
        String approach = "amble";
        //approach = "run";
        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }

    void play(Gorilla g) {
        System.out.println(g.move());
    }
}

interface Gorilla {
    String move();
}

class Test {
    public static void main(String[] args) {
        GorillaFamily gf = new GorillaFamily();
        gf.everyonePlay(false);
    }
}