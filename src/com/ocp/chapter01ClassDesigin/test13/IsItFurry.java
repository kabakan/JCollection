package com.ocp.chapter01ClassDesigin.test13;

/**
 * Created by Kanat KB on 22.07.2017.
 * B. The output is 3.
 */
public class IsItFurry {
    static interface Mammal {
    }

    static class Furry implements Mammal {
    }

    static class Chipmunk extends Furry {
    }

    public static void main(String[] args) {
        Chipmunk c = new Chipmunk();
        Mammal m = c;
        Furry f = c;
        int result = 0;
        if (c instanceof Mammal) result += 1;
        if (c instanceof Furry) result += 2;
        if (null instanceof Chipmunk) result += 4;
        System.out.println(result);
    }
}