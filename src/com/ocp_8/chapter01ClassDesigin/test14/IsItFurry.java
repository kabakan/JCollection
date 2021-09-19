package com.ocp_8.chapter01ClassDesigin.test14;

/**
 * Created by Kanat KB on 22.07.2017.
 * E. l instanceof Chipmunk does not compile.
 */

import java.util.*;

public class IsItFurry {
    static class Chipmunk {
    }

    public static void main(String[] args) {
        Chipmunk c = new Chipmunk();
        ArrayList<Chipmunk> l = new ArrayList<>();
        Runnable r = new Thread();
        int result = 0;
        if (c instanceof Chipmunk) result += 1;
       // if (l instanceof Chipmunk) result += 2;
        if (r instanceof Chipmunk) result += 4;
        System.out.println(result);
    }
}