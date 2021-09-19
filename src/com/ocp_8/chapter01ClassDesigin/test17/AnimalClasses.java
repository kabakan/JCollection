package com.ocp_8.chapter01ClassDesigin.test17;

/**
 * Created by Kanat KB on 22.07.2017.
 * B. Compiler error on line 3.
 * C. Compiler error on line 5.
 */

public enum AnimalClasses {
    MAMMAL(true), FISH(Boolean.FALSE), BIRD(false),
    REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false);
    boolean hasHair;

    //public AnimalClasses(boolean hasHair) {
    private AnimalClasses(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public boolean hasHair() {
        return hasHair;
    }

    public void giveWig() {
        hasHair = true;
    }
    }

class Test {
    public static void main(String[] args) {
        System.out.println(AnimalClasses.MAMMAL);
    }
}