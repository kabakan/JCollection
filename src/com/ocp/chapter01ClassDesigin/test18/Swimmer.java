package com.ocp.chapter01ClassDesigin.test18;

/**
 * Created by Kanat KB on 22.07.2017.
 * G. The code does not compile.
 */
public class Swimmer {
    enum AnimalClasses {
        MAMMAL,
        FISH {
            public boolean hasFins() {
                return true;
            }
        },
        BIRD, REPTILE, AMPHIBIAN, INVERTEBRATE;

     //   public abstract boolean hasFins();
    }

    public static void main(String[] args) {
        System.out.println(AnimalClasses.FISH);
        System.out.println(AnimalClasses.FISH.ordinal());
       // System.out.println(AnimalClasses.FISH.hasFins());
       // System.out.println(AnimalClasses.BIRD.hasFins());
    }
}

