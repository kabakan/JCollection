package com.example.designed;

/**
 * Created by Kanat KB on 26.08.2017.
 */


interface HasTail {
    public boolean isTailStriped();
}

class Primate {
    public boolean hasHair() {
        return true;
    }
}

public class Lemur extends Primate implements HasTail {
    public int age = 10;

    public boolean isTailStriped() {
        return false;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());

        Lemur lemur3 = (Lemur) primate;
        System.out.println(lemur3.age);
    }
}
