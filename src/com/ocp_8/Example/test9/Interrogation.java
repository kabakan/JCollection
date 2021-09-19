package com.ocp_8.Example.test9;

import java.util.*;

@FunctionalInterface
interface LieDetector<T> { boolean analyze(T s); }

public class Interrogation {
    private static void interrogate(List<Suspect> perps, LieDetector<Suspect> ld){
        for(Suspect s : perps)
            if(!ld.analyze(s))
                System.out.println(s.getName() + " is lying");
    }
    public static void main(String[] args) {
        List<Suspect> roundUp = new ArrayList();
        roundUp.add(new Suspect("Alice"));
        roundUp.add(new Suspect("Bob"));
        roundUp.add(new Suspect("Charlie"));
        roundUp.add(new Suspect("Doug"));
        roundUp.add(new Suspect("Eugine"));
        roundUp.add(new Suspect("Frances"));

        interrogate(roundUp, perps -> perps.getStatement());
    }
}

class Suspect {
    private String name;
    private boolean statement;

    public Suspect (String name) {
        this.name = name;
        this.statement = Math.random() < 0.5 ? false : true;
    }

    public boolean getStatement() { return statement; }
    public String  getName()      { return name;      }
}